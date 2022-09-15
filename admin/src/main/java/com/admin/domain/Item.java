package com.admin.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author flori
 */
@Data
@Entity
@Table(name = "item")
public class Item implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item;
    
    @NotEmpty
    private String item_name;
    
    @NotEmpty
    private String item_description;
    
    @NotEmpty
    private String item_rate;
    
    @NotEmpty
    private Long id_property;
    
    @NotEmpty
    private Long id_service;
    
}
