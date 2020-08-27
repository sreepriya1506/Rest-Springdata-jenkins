package org.dxc.mongodb.controller;

import java.util.Collection;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired 
	private EmployeeService employeeService; 
	
	@RequestMapping(value="/saveemployee",method=RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		
	}
	
	@RequestMapping("/getemployees")
	public Collection<Employee> getAllEmployee(){
		Collection<Employee> employees=employeeService.getAllEmployee();
	return employees;
}
	@RequestMapping("/getemployeebyid")
	public Optional<Employee> findEmployeeById(@RequestParam ("employeeid") double employeeid){
		Optional<Employee> result=employeeService.findByEmployeeId(employeeid);
		return result;
	}
	
	@RequestMapping(value="/deleteemployee" , method=RequestMethod.DELETE)
	public void deleteBook(@RequestParam ("employeeid") double employeeid){
		employeeService.delete(employeeid);
		
	}
	@RequestMapping(value="/deleteall" , method=RequestMethod.DELETE)
	public void deleteAll(){
		employeeService.deleteAll();
	}
	


}