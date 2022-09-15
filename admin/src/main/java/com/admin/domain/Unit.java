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
@Table(name = "unit")
public class Unit implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_unit;
    
    @NotEmpty
    private String unit_number;
    
    @NotEmpty
    private String unit_address;
    
    @NotEmpty
    private int unit_bed;
    
    @NotEmpty
    private int unit_bath;
    
    @NotEmpty
    private Long id_property;
        
}
