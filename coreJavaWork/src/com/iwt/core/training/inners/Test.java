package com.iwt.core.training.inners;

class Inner1 {
}

public class Test {

	private int x;

	class Inner2 {
		private void method() {
			x += 1;
		}
	}

	private void method() {
		class Inner3 {
		}
		Inner3 inner3 = new Inner3();
	}

	static class Inner4 {
		private void method() {
		}
	}

	public static void main(String[] args) {
		Inner1 inner1 = new Inner1();
		Test test = new Test();
		Inner2 inner2 = test.new Inner2();
		Inner4 inner4 = new Test.Inner4();

	}

}
