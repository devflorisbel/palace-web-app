package com.admin.service;

import com.admin.domain.Orden;
import java.util.List;

/**
 *
 * @author flori
 */

public interface OrdenService {
    
    public List<Orden> findAllOrdenes();
    
    public void save(Orden orden);
    
    public void delete(Orden orden);
    
    public Orden findOrden(Orden orden);
    
    
}
