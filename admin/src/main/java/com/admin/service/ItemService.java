package com.admin.service;

import com.admin.domain.Item;
import java.util.List;

/**
 *
 * @author flori
 */

public interface ItemService {
    
    public List<Item> findAllItems();
    
    public void save(Item item);
    
    public void delete(Item item);
    
    public Item findItem(Item item);
    
    
}
