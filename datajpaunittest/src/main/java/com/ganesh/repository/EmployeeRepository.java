package com.ganesh.repository;

/*
 * @created: 28/02/2021 - 8:36 AM
 * @author: Ganesh
 */


import com.ganesh.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
