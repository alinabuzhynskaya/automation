package com.intro_alina.oops;

public class BookRunner {

	public static void main(String[] args) {
	
    Book artOfComputerProgramming = new Book(1000);
	Book effectiveJava = new Book(1000);
	Book cleanCode = new Book(1000);
	
	//artOfComputerProgramming.setNoOfCopies(10);
	//effectiveJava.setNoOfCopies(6);
	//cleanCode.setNoOfCopies(15);
	
	artOfComputerProgramming.increaseNoOfCopies(1);
	effectiveJava.increaseNoOfCopies(2);
	cleanCode.increaseNoOfCopies(3);
	
	artOfComputerProgramming.decreaseNoOfCopies(2);
	effectiveJava.decreaseNoOfCopies(3);
	cleanCode.decreaseNoOfCopies(4);
	
    System.out.println(artOfComputerProgramming.getNoOfCopies());
    System.out.println(effectiveJava.getNoOfCopies());
    System.out.println(cleanCode.getNoOfCopies());
	}

}
