package com.intro_alina.oops;

public class MotorBike {
	//state
	private int speed;//member variable
	
	MotorBike(int speed){
		this.speed=speed;
	}
	
public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
		this.speed = speed;
	}
    public void increaseSpeed (int howMuch) {
	this.speed=this.speed + howMuch;
    }
    
    public void decreaseSpeed (int howMuch) {
    	setSpeed(this.speed-howMuch);
        }
    
    public void start() {
	System.out.println("Bike started");
    }
 

}