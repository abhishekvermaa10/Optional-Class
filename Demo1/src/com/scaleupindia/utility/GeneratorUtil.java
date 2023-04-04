package com.scaleupindia.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.entity.Passport;

/**
 * @author abhishekvermaa10
 *
 */
public class GeneratorUtil {
	public static List<Employee> generateEmployees1() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", Optional.of(new Passport(10, "India"))));
		employeeList.add(new Employee(129, "John", Optional.of(new Passport(32, "Canada"))));
		employeeList.add(new Employee(109, "Roman", Optional.of(new Passport(45, "USA"))));
		employeeList.add(new Employee(177, "Sneh", Optional.of(new Passport(23, "India"))));
		employeeList.add(new Employee(153, "Robert", Optional.of(new Passport(57, "UK"))));
		employeeList.add(new Employee(102, "Elisa", Optional.of(new Passport(66, "Canada"))));
		return employeeList;
	}

	public static List<Employee> generateEmployees2() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", Optional.of(new Passport(10, "India"))));
		employeeList.add(new Employee(129, "John", Optional.of(new Passport(32, "Canada"))));
		employeeList.add(new Employee(109, "Roman", Optional.empty()));
		employeeList.add(new Employee(177, "Sneh", Optional.of(new Passport(23, "India"))));
		employeeList.add(new Employee(153, "Robert", Optional.of(new Passport(57, "UK"))));
		employeeList.add(new Employee(102, "Elisa", Optional.of(new Passport(66, "Canada"))));
		return employeeList;
	}
}
