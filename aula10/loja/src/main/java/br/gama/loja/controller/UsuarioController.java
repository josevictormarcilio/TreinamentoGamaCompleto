package br.gama.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gama.loja.dao.UsuarioDAO;
import br.gama.loja.model.Pedido;
import br.gama.loja.model.Usuario;

@RestController
@CrossOrigin("*") //aceita pedidos de qualquer origem
 public class UsuarioController {

    @Autowired //JPA cria classe e gera objeto
    private UsuarioDAO dao;

    @GetMapping("/usuario/{id}") //forma de como chamar o método
    public ResponseEntity<Usuario> buscaUsuario (@PathVariable int id){ //tem que ser o mesmo nome do GetMapping
        Usuario usuario = dao.findById(id).orElse(null);

        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/usuario/novo")
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario user){
        try { 
            Usuario novo = dao.save(user); //salva o usuário no BD
            return ResponseEntity.ok(novo); //retorna os dados do usuário inserido no BD
        } catch (Exception ex) {
            return ResponseEntity.status(400).build(); //400 = bad request (dados não encontrados)
        }
    }

    @PostMapping("/usuario/login")
    public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario user){
        //Usuario userFinded = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
        Usuario userFinded = dao.findByEmailOrCpf(user.getEmail(), user.getCpf());

        if (userFinded != null){
            if(userFinded.getSenha().equals(user.getSenha())){
                userFinded.setSenha("**********");
                userFinded.setPedidos(null);
                return ResponseEntity.ok(userFinded);
            } else {
                return ResponseEntity.status(403).build(); //403 = forbidden (proibido)
            }
    
        } else {
            //return ResponseEntity.status(404).build(); 
            return ResponseEntity.status(403).build(); 
        }
    }

    @PostMapping("/usuario/update")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario user){

        try { 

            if (user.getId() > 0) {
                Usuario novo = dao.save(user); //salva o usuário no BD
                return ResponseEntity.ok(novo); //retorna os dados do usuário inserido no BD
            } else {
                return ResponseEntity.status(404).build(); //404 = usuário não existe 
            }

        } catch (Exception ex) {
            return ResponseEntity.status(400).build(); //400 = bad request (dados não encontrados)
        }
    }

    @GetMapping("/usuario/pedidos/{id}")
    public List<Pedido> getUsuariosPedidos(@PathVariable int id){
        List<Pedido> lista = dao.buscaPendentesPorId(id);

        return lista;
    }
}