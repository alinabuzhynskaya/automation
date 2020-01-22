package com.intro_alina.oops;

import java.io.InputStream;
import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
	Scanner scanner =new Scanner (System.in);
	System.out.print ("Enter Number 1: ");
	int number1 = scanner.nextInt() ; 	
	System.out.println("The number you entered is Number - " +  number1);
	System.out.print ("Enter Number 2: ");
    int number2 = scanner.nextInt();
    System.out.println("The number you entered is Number - " +  number2);
    System.out.println(" 1-Add, 2-Subsctract, 3-Divide, 4-Multiply");
    System.out.print(" Choose Operation: ");
    int operation = scanner.nextInt();
    
    usingSwitch(number1, number2, operation);
       }

	private static void usingElseIf(int number1, int number2, int operation) {
		if (operation == 1) {
			System.out.println("Result " + (number1 + number2));
		}
		   else if(operation == 2) {
			System.out.println("Result " + (number1 - number2));
		   }
		   else if (operation == 3) {
		   System.out.println("Result " + (number1 / number2));
		   }
		   else if (operation == 4) {
			   System.out.println("Result " + (number1 * number2));
		   }
		   else {
			   System.out.println("Unknown operation" ); 
		   }
	}
	
	private static void usingSwitch (int number1, int number2, int operation) {
		switch (operation) {
		case 1: System.out.println("Result " + (number1 + number2)); break;
	    case 2: System.out.println("Result " + (number1 - number2)); break;
	    case 3: System.out.println("Result " + (number1 / number2)); break;  
	    case 4: System.out.println("Result " + (number1 * number2)); break;
		default: System.out.println("Unknown operation" ); break;
		   }
	}

}
