package com.scaleupindia;

import java.util.Optional;

import com.scaleupindia.entity.Address;
import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

public class Demo4 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(10);
		System.out.println(optionalEmployee);

		/*
		 * Map address of optionalEmployee and save in optionalAddress. Print
		 * optionalAddress. Map city of optionalAddress, if exists then print value else
		 * print "No employee found".
		 */
		System.out.println("---FLAT MAP---");
		Optional<Address> optionalAddress = optionalEmployee.flatMap(Employee::getAddress);
		System.out.println(optionalAddress);

		Optional<String> optionalCity = optionalAddress.map(Address::getCity);
		optionalCity.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
	}

}
