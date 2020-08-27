package org.dxc.mongodb.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface EmployeeRepository extends MongoRepository<Employee,BigInteger>{


	Optional<Employee> findByEmployeeid(double employeeid);

	void deleteByEmployeeid(double employeeid);


	
}
