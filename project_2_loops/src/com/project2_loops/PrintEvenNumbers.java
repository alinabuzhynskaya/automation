package com.project2_loops;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		PrintEvenNumbers evnum = new PrintEvenNumbers();
		
		for (int i=1; i<= 10; i++) {
			if (i%2!=0)
				continue;
			System.out.println(i + " ");
		}
	}

}
