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
@Table(name = "service")
public class Servicio implements Serializable {

    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_service;
    
    @NotEmpty
    private String service_name;
    
    @NotEmpty
    private boolean service_state;

}
