package br.gama.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.gama.loja.dao.PedidoDAO;
import br.gama.loja.model.Pedido;


@RestController
@CrossOrigin("*") //aceita pedidos de qualquer origem
public class PedidoController {
    
    //buscar um pedido por número do pedido

    @Autowired //JPA cria classe e gera objeto
    private PedidoDAO dao;

    @GetMapping("/pedido/{id}") //forma de como chamar o método
    public ResponseEntity<Pedido> buscaPedidoPorId (@PathVariable int id){ //tem que ser o mesmo nome do GetMapping
        Pedido pedido = dao.findById(id).orElse(null);

        if (pedido != null) {
            return ResponseEntity.ok(pedido);
        }
        return ResponseEntity.notFound().build();
    }

    //listar todos os pedidos

    @GetMapping("/pedido/listapedidos") //forma de como chamar o método
    public List<Pedido> getPedidos(){
        List<Pedido> lista = (List<Pedido>) dao.findAll();
        return lista;
    }

    //listar todos os pedidos pendentes

    @GetMapping("/pedido/listapendente/{status}") //forma de como chamar o método
    public List<Pedido> buscaPorStatus(@PathVariable char status){
        List<Pedido> lista = dao.findByStatus(status);
        return lista;
    }


}