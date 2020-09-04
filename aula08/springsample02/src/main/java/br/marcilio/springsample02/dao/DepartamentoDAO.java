package br.marcilio.springsample02.dao;

import org.springframework.data.repository.CrudRepository;

import br.marcilio.springsample02.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer>{
    
}