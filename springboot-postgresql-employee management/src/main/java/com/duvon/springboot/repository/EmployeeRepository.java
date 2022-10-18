package com.duvon.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duvon.springboot.model.Employee;


//custom Jpa repository , pass jpa entity and primary key type
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	
}
