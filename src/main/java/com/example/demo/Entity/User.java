package com.example.demo.Entity;

public class User {
	private int b1000;
	private int b500;
	private int b100;
	
	public int getB1000() {
		return b1000;
	}
	public void setB1000(int b1000) {
		this.b1000 = b1000;
	}
	public int getB500() {
		return b500;
	}
	public void setB500(int b500) {
		this.b500 = b500;
	}
	public int getB100() {
		return b100;
	}
	public void setB100(int b100) {
		this.b100 = b100;
	}
	
	public int Processb1000(int money) {
		b1000++;
		money = money - 1000;
		return money;
	}
	public int Processb500(int money) {
		b500++;
		money = money - 500;
		return money;
	}
	public int Processb100(int money) {
		b100++;
		money = money - 100;
		return money;
	}
	

	
 
}
