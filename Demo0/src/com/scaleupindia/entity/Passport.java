package com.scaleupindia.entity;

/**
 * @author abhishekvermaa10
 *
 */
public class Passport {
	private int id;
	private String country;

	public Passport(int id, String country) {
		super();
		this.id = id;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", country=" + country + "]";
	}
}