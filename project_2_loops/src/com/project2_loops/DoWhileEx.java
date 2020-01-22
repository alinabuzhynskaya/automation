package com.project2_loops;

import java.util.Scanner;

public class DoWhileEx {
	Scanner scanner = new Scanner(System.in);
	int number = -1;

	public void cubeNumber() {
		do {
			int a = number * number * number;
			if (number != -1) {
				System.out.println("Cube of this number: " + a);
			}
			System.out.print("Enter Number : ");
			this.number = scanner.nextInt();
		} while (number >= 0);
		System.out.println("Thank you!");
	}

}
