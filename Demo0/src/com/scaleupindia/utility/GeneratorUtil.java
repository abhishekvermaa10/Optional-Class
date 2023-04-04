package com.scaleupindia.utility;

import java.util.ArrayList;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.entity.Passport;

/**
 * @author abhishekvermaa10
 *
 */
public class GeneratorUtil {
	public static List<Employee> generateEmployees1() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", new Passport(10, "India")));
		employeeList.add(new Employee(129, "John", new Passport(32, "Canada")));
		employeeList.add(new Employee(109, "Roman", new Passport(45, "USA")));
		employeeList.add(new Employee(177, "Sneh", new Passport(23, "India")));
		employeeList.add(new Employee(153, "Robert", new Passport(57, "UK")));
		employeeList.add(new Employee(102, "Elisa", new Passport(66, "Canada")));
		return employeeList;
	}

	public static List<Employee> generateEmployees2() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", new Passport(10, "India")));
		employeeList.add(new Employee(129, "John", new Passport(32, "Canada")));
		employeeList.add(new Employee(109, "Roman", null));
		employeeList.add(new Employee(177, "Sneh", new Passport(23, "India")));
		employeeList.add(new Employee(153, "Robert", new Passport(57, "UK")));
		employeeList.add(new Employee(102, "Elisa", new Passport(66, "Canada")));
		return employeeList;
	}
}
