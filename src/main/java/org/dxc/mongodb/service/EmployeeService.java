package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;

public interface EmployeeService {

	

	Collection<Employee> getAllEmployee();

	public void saveEmployee(Employee employee);

	Optional<Employee> findByEmployeeId(double employeeid);

	void delete(double employeeid);

	void deleteAll();

	
}
