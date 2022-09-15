package com.admin.service;

import com.admin.dao.ServicioDao;
import com.admin.domain.Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author flori
 */
@Service
public class ServicioServiceImpl implements ServicioService{
    
    @Autowired
    private ServicioDao servicioDao;

    @Override
    @Transactional(readOnly=true)
    public List<Servicio> findAllServicios() {
        return (List<Servicio>) servicioDao.findAll();
    }

    @Override
    @Transactional
    public void save(Servicio servicio) {
        servicioDao.save(servicio);
    }

    @Override
    @Transactional
    public void delete(Servicio servicio) {
        servicioDao.delete(servicio);
    }

    @Override
    @Transactional(readOnly=true)
    public Servicio findServicio(Servicio servicio) {
        return servicioDao.findById(servicio.getId_service()).orElse(null);
    }
    
}
