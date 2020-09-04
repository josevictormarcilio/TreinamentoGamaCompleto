package br.marcilio.springsample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//servidor:porta padrão/pasta que vou querer acessar/o que quero acionar
//localhost:8080/sample/hello

@RestController //responder requisições do tipo rest
@CrossOrigin("*") //aceita pedidos de qualquer origem
@RequestMapping("/sample") //rota para esse classe
public class SampleController {
    
    @GetMapping("/hello") //rota para este método
    public ResponseEntity<String> ola(){
        return ResponseEntity.ok("Hello World! Meu primeiro Spring Boot!"); //exibir mensagem na tela (ok: deu tudo certo - cód. 200)
    }

}