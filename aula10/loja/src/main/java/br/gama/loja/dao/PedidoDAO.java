package br.gama.loja.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import br.gama.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer>{
    public List<Pedido> findByStatus(char status);
}