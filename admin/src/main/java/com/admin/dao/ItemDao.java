package com.admin.dao;

import com.admin.domain.Item;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author flori
 */
public interface ItemDao extends CrudRepository<Item, Long>{
    
}
