package com.admin.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author flori
 */
@Data
@Entity
@Table(name = "property")
public class Property implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_property;
    
    @NotEmpty
    private String property_name;
    
    @NotEmpty
    private String property_address;
    
    @NotEmpty
    private String property_city;
    
    @NotEmpty
    private String property_state;
    
    @NotEmpty
    private String property_zipcode;
    
    @NotEmpty
    private String property_email1;
    
    @NotEmpty
    private String property_email2;
    
    @NotEmpty
    private String property_phone;
    
    
    
    
}
