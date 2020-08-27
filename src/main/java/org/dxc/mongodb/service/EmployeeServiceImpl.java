package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository; 

	@Override
	public Collection<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> findByEmployeeId(double employeeid) {
		return employeeRepository.findByEmployeeid(employeeid) ;
	}

	@Override
	public void delete(double employeeid) {
		employeeRepository.deleteByEmployeeid(employeeid);
	}

	@Override
	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	@Override
	public void update(Employee employee) {
		employeeRepository.save(employee);
		
	}

	

}
