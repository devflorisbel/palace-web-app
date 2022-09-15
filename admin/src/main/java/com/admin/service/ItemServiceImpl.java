package com.admin.service;

import com.admin.dao.ItemDao;
import com.admin.domain.Item;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author flori
 */
@Service
public class ItemServiceImpl implements ItemService{
    
    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> findAllItems() {
        return (List<Item>) itemDao.findAll();
    }

    @Override
    public void save(Item item) {
        itemDao.save(item);
    }

    @Override
    public void delete(Item item) {
        itemDao.delete(item);
    }

    @Override
    public Item findItem(Item item) {
        return itemDao.findById(item.getId_item()).orElse(null);
    }
    
}
