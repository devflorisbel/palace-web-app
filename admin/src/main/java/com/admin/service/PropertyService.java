package com.admin.service;

import com.admin.domain.Property;
import java.util.List;


/**
 *
 * @author flori
 */
public interface PropertyService {
    
    public List<Property> findAllProperties();
    
    public void save(Property property);
    
    public void delete(Property property);
    
    public Property findProperty(Property property);
    
}
