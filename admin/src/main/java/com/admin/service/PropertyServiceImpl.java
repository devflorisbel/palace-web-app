package com.admin.service;

import com.admin.dao.PropertyDao;
import com.admin.domain.Property;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author flori
 */

@Service
public class PropertyServiceImpl implements PropertyService{
    
    @Autowired
    private PropertyDao propertydao;

    @Override
    @Transactional(readOnly = true)
    public List<Property> findAllProperties() {
        return (List<Property>) propertydao.findAll();
    }

    @Override
    @Transactional
    public void save(Property property) {
        propertydao.save(property);
    }

    @Override
    @Transactional
    public void delete(Property propertie) {
        propertydao.delete(propertie);
    }

    @Override
    @Transactional(readOnly = true)
    public Property findProperty(Property property) {
        return propertydao.findById(property.getId_property()).orElse(null);
    }
    
}
