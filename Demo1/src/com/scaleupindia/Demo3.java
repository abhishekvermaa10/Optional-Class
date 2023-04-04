package com.scaleupindia;

import java.util.Optional;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		add(Optional.of(100), Optional.empty());
		add(Optional.of(100), Optional.of(200));
		// add(Optional.of(100), Optional.of(null));
		add(Optional.ofNullable(100), Optional.ofNullable(200));
		add(Optional.ofNullable(100), Optional.ofNullable(null));
	}

	public static void add(Optional<Integer> num1, Optional<Integer> num2) {
		int a = 0;
		int b = 0;
		if (num1.isPresent()) {
			a = num1.get();
		}
		if (num2.isPresent()) {
			b = num2.get();
		}
		System.out.println(num1 + " + " + num2 + " = " + (a + b));
	}
}
