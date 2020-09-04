package br.marcilio.springsample02.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.marcilio.springsample02.dao.ProjetoDAO;
import br.marcilio.springsample02.model.Projeto;

@RestController //é um controller
@CrossOrigin("*") //aceito requisições sem restrições de dominio, pode vir de qualquer lugar
public class ProjetoController {

    @Autowired
    private ProjetoDAO dao;

    @GetMapping("/projetos")
    public List<Projeto> geProjetos (){
        List<Projeto> lista = (List<Projeto>) dao.findAll();
        return lista;
    }

    @GetMapping("/projeto/{cod}")
    public ResponseEntity<Projeto> findProjetos(@PathVariable int cod){ //entidade de resposta que contém departamento, tenho objeto departamento dentro da minha resposta
        Projeto proj = dao.findById(cod).orElse(null);

        if (proj != null) {
            return ResponseEntity.ok(proj);
        }
        return ResponseEntity.status(404).build(); //consigo manipular o status que ele retorna
    }
    
}
    
