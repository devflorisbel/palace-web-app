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
@Table(name = "orden")
public class Orden implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_orden;
    
    @NotEmpty
    private Long id_property;
    
    @NotEmpty
    private String po_orden;
    
    @NotEmpty
    private Long id_unit;
    
    @NotEmpty
    private String submit_date;
    
    @NotEmpty
    private String scheduled_date;
    
    @NotEmpty
    private String limit_date;
    
    @NotEmpty
    private String observations;
    
    
    
    
    
    
    
}
