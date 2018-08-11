package com.brier.compapi.dao;
import org.springframework.data.repository.CrudRepository;

import com.brier.compapi.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Long> {

}
