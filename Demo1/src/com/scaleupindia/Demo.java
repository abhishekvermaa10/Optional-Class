package com.scaleupindia;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.generateEmployees1();
		Map<Integer, String> map = employeeList.stream()
				.collect(Collectors.toMap(Employee::getId, employee -> employee.getPassport().get().getCountry()));
		displayData(map);

		List<Employee> employeeList2 = GeneratorUtil.generateEmployees2();
		Map<Integer, String> map2 = employeeList2.stream().filter(employee -> employee.getPassport().isPresent())
				.collect(Collectors.toMap(Employee::getId, employee -> employee.getPassport().get().getCountry()));
		displayData(map2);
	}

	public static void displayData(Map<Integer, String> map) {
		System.out.println("Data of map is:");
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}

	public static void add(Optional<Integer> num1, Optional<Integer> num2) {
		Integer a = 0, b = 0;
		if (num1.isPresent()) {
			a = num1.get();
		}
		if (num2.isPresent()) {
			b = num2.get();
		}
		System.out.println(a + b);
	}
}
