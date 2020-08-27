package org.dxc.mongodb.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="employee")
public class Employee {
@Id
@Field(name="_id")
private BigInteger objectId;
private double employeeid;
private String firstname;
private String lastname;
private String jobtitle;
private double salary;


@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname + ", jobtitle="
			+ jobtitle + ", salary=" + salary + "]";
}


}
