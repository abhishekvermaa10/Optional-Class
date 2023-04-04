package com.scaleupindia.entity;

import java.util.Optional;

/**
 * @author abhishekvermaa10
 *
 */
public class Employee {
	private int id;
	private String name;
	private Optional<Passport> passport;

	public Employee(int id, String name, Optional<Passport> passport) {
		super();
		this.id = id;
		this.name = name;
		this.passport = passport;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Optional<Passport> getPassport() {
		return passport;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}
}