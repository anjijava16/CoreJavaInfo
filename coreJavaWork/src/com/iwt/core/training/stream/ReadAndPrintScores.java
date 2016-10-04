package com.iwt.core.training.stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndPrintScores {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("scores.dat"));
			while (s.hasNextInt()) {
				System.out.println(s.nextInt());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}