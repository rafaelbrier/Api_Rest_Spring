package com.brier.compapi.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brier.compapi.model.Processador;

public interface ProcessadorDAO extends CrudRepository<Processador, Long> {
	
//	@Query(value = "SELECT * FROM public.processador p ORDER BY p.preco ASC", nativeQuery = true)
//	public List<Processador> findAllOrderByPrecoAsc();
	
	public List<Processador> findAllByOrderByPrecoAsc();

}
