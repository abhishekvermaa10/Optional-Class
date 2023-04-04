package com.scaleupindia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.entity.Passport;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	private static List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {
		employeeList = GeneratorUtil.generateEmployees2();
		getEmployee(109);
		getEmployee(100);
		getEmployeePassport2(109);
		getEmployeePassport(109);
		getEmployeePassport2(100);
		getEmployeePassport(100);
	}

	public static void getEmployee(int id) {
		Optional<Employee> optional = employeeList.stream().filter(employee -> employee.getId() == id).findFirst();
		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println(optional.orElse(new Employee(0, null, null)));
		}
	}

	public static void getEmployeePassport(int id) {
		Optional<Passport> optional = employeeList.stream().filter(employee -> employee.getId() == id).findFirst()
				.map(Employee::getPassport).get();
		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println(optional.orElse(new Passport(0, null)));
		}
	}

	public static void getEmployeePassport2(int id) {
		Optional<Passport> optional = employeeList.stream().filter(employee -> employee.getId() == id).findFirst()
				.flatMap(Employee::getPassport);
		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println(optional.orElse(new Passport(0, null)));
		}
	}
}
