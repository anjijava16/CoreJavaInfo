package com.iwt.core.training.exceptions;

public class Test {

	static class DivisionException extends Error {
		public DivisionException(String msg) {
			super(msg);
		}
	}

	public static int divide(int a, int b) throws DivisionException {
		if (b == 0) {
			throw new DivisionException("/ by zero !");
		}
		return a / b;
	}

	public static void main(String[] args) {
		divide(10, 0);
	}

}
