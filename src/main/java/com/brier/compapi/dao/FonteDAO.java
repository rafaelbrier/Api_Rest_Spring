package com.brier.compapi.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.brier.compapi.model.Fonte;

public interface FonteDAO extends CrudRepository<Fonte, Long>  {
	
	public List<Fonte> findAllByOrderByPrecoAsc();
	
}
