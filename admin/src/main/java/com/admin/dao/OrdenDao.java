package com.admin.dao;

import com.admin.domain.Orden;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author flori
 */
public interface OrdenDao extends CrudRepository<Orden, Long>{
    
}
