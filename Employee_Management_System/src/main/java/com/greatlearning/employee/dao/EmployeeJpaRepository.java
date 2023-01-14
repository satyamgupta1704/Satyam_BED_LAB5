package com.greatlearning.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employee.model.Employee;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long>{

}
