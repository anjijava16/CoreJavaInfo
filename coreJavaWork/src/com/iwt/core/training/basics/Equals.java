package com.iwt.core.training.basics;

import java.util.HashSet;
import java.util.Set;

public class Equals {

	private final int value;

	public Equals(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		return this.value == ((Equals) obj).value;
	}

	@Override
	public int hashCode() {
		return 13;
	}

	@Override
	public String toString() {
		return "Equals:" + value;
	}

	public static void main(String[] args) {

		Set<Equals> set = new HashSet<Equals>();
		Equals eq1 = new Equals(10);
		Equals eq2 = new Equals(10);
		set.add(eq1);
		set.add(eq2);
		System.out.println(set);

	}

}
