package com.lulu.assignment;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();

		if (N < 2 || N > 20) {
			System.out.println("Input out of range.");
			return;
		}

		for (int i = 1; i <= 10; i++) {
			int result = N * i;
			System.out.println(N + " x " + i + " = " + result);
		}
	}
}
