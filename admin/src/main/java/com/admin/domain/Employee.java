package com.admin.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author palac
 */
@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idemployee;
    
    @NotEmpty
    private String firstname;
    
    @NotEmpty
    private String lastname;
    
    @NotEmpty
    private String address;
    
    @NotEmpty
    private String city;
    
    @NotEmpty
    private String st;
    
    @NotEmpty
    private String zipcode;
    
    @NotEmpty
    private String country;
    
    @NotEmpty
    @Email
    private String email;
    
    @NotEmpty
    private String phonenumber;
    
    @NotEmpty
    private Long id_service;
}
