package com.project2_loops;

public class MyNumber {

	int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if (number < 2) {
			return false;
		}
		for (int x = 2; x < number; x++)
			if (number % x == 0) {
				return false;
			}

		return true;
	}

	public int sumUptoN() {
		int summator = 0;

		for (int x = 1; x <= number; x++) {
			summator += x;
		}

		return summator;
	}

	public int sumOfDivisors() {

		int summator = 0;

		for (int x = 2; x < number; x++) {
			if (number % x == 0) {
				summator += x;
			}
		}

		return summator;

	}

	public void printNumberTriangle() {
		for (int x = 1; x <= number; x++) {
			for (int i = 1; i <= x; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
