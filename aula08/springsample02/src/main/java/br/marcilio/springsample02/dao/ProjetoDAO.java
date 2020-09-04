package br.marcilio.springsample02.dao;

import org.springframework.data.repository.CrudRepository;

import br.marcilio.springsample02.model.Projeto;

public interface ProjetoDAO extends CrudRepository<Projeto, Integer>{
    
}