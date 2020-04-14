package com.sy.s3.robot;

public class RightArm {
	private int power;
	private String color;
	
	public RightArm(int power, String color) {
		this.power = power;
		this.color = color;
	}
	
	public RightArm() {
		
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	
	
}
