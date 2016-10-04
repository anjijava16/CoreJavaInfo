package com.iwt.core.training.misc;

import java.io.IOException;

class Notepad {
	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();

		try {
			rs.exec("notepad");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}