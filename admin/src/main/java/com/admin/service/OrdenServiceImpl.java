package com.admin.service;

import com.admin.dao.OrdenDao;
import com.admin.domain.Orden;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author flori
 */
@Service
public class OrdenServiceImpl implements OrdenService{
    
    @Autowired
    private OrdenDao ordenDao;

    @Override
    public List<Orden> findAllOrdenes() {
        return (List<Orden>) ordenDao.findAll();
    }

    @Override
    public void save(Orden orden) {
        ordenDao.save(orden);
    }

    @Override
    public void delete(Orden orden) {
        ordenDao.delete(orden);
    }

    @Override
    public Orden findOrden(Orden orden) {
        return ordenDao.findById(orden.getId_orden()).orElse(null);
    }
    
}
