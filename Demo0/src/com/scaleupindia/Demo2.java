package com.scaleupindia;

import java.util.Optional;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println(fetchEmployeeByMarks(60));
		System.out.println(fetchEmployeeByMarks(66));
	}

	public static Optional<Employee> fetchEmployeeByMarks(int marks) {
		/*
		 * Fetch the list of employees using GeneratorUtil.populateEmployees(). Iterate
		 * over the list. Return first employee whose marks are same as given marks.
		 */
		return GeneratorUtil.populateEmployees().stream().filter(employee -> employee.getMarks() == marks).findFirst();
	}
}
