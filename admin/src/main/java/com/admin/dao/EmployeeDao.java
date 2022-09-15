package com.admin.dao;

import com.admin.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author palac
 */
public interface EmployeeDao extends CrudRepository<Employee, Long>{
    
}
