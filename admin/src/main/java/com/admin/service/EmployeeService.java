/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.admin.service;

import com.admin.domain.Employee;
import java.util.List;

/**
 *
 * @author flori
 */
public interface EmployeeService {
    
    public List<Employee> findAllEmployees();
    
    public void save(Employee employee);
    
    public void delete(Employee employee);
    
    public Employee findEmployee(Employee employee);
    
    
}
