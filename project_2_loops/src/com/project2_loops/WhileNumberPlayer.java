package com.project2_loops;

public class WhileNumberPlayer {
	int number;

	public WhileNumberPlayer(int number) {
		this.number = number;
	}

	public void printSquearesUpToLimit() {
		int i = number;
		int a = number * number;
		while (a < i) {
			System.out.print((a));
			a++;
		}

	}

}
