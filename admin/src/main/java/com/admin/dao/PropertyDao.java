/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.admin.dao;

import com.admin.domain.Property;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author flori
 */
public interface PropertyDao extends CrudRepository<Property, Long>{
    
}
