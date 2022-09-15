/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.admin.service;

import com.admin.dao.EmployeeDao;
import com.admin.domain.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author flori
 */

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDao employeedao;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAllEmployees() {
        return (List<Employee>) employeedao.findAll();
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeedao.save(employee);
    }

    @Override
    @Transactional
    public void delete(Employee employee) {
        employeedao.delete(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public Employee findEmployee(Employee employee) {
        return employeedao.findById(employee.getIdemployee()).orElse(null);
    }
    
}
