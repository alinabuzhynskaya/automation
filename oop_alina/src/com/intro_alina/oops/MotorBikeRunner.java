package com.intro_alina.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducatti= new MotorBike(100);
		MotorBike honda= new MotorBike(100);
		
		//ducatti.setSpeed(100);
		//honda.setSpeed(80);
		
		ducatti.start();
		honda.start();
		
	ducatti.increaseSpeed(100);
	honda.increaseSpeed(100);
	
	ducatti.decreaseSpeed(20);
	honda.decreaseSpeed(10);
		
		System.out.println(ducatti.getSpeed());
		System.out.println(honda.getSpeed());
	}
 
}
