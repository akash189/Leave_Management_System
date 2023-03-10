package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	List<Employee> findByRole(String role);

	List<Employee> findByUsername(String username);
	Employee getReferenceByUsernameAndPassword(String username, String password);
	List<Employee> findByRoleOrRole(String role, String role2);
	Employee getReferenceByEmpidAndPassword(int empid, String opass);
	Employee getReferenceByName(String name);

}
