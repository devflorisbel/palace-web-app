package com.admin.service;

import com.admin.domain.Servicio;
import java.util.List;

/**
 *
 * @author flori
 */
public interface ServicioService {
    
    public List<Servicio> findAllServicios();
    
    public void save(Servicio servicio); 
    
    public void delete(Servicio servicio);
    
    public Servicio findServicio(Servicio servicio);
    
}
