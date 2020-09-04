package br.marcilio.springsample02.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.marcilio.springsample02.dao.DepartamentoDAO;
import br.marcilio.springsample02.model.Departamento;

@RestController //é um controller
@CrossOrigin("*") //aceito requisições sem restrições de dominio, pode vir de qualquer lugar
public class DepartamentoController {

    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamentos (){
        List<Departamento> lista = (List<Departamento>) dao.findAll();
        return lista;
    }

    @GetMapping("/departamento/{cod}")
    public ResponseEntity<Departamento> findDepartamento(@PathVariable int cod){ //entidade de resposta que contém departamento, tenho objeto departamento dentro da minha resposta
        Departamento depto = dao.findById(cod).orElse(null);

        if (depto != null) {
            return ResponseEntity.ok(depto);
        }
        return ResponseEntity.status(404).build(); //consigo manipular o status que ele retorna
    }
    
}