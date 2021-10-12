package com.cg.app;

public class Phone {

	int ram;
	String brand;
	
	Sim sim;
	
	
	
	
	public int getRam() {
		return ram;
	}




	public void setRam(int ram) {
		this.ram = ram;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public Sim getSim() {
		return sim;
	}




	public void setSim(Sim sim) {
		this.sim = sim;
	}




	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Phone(int ram, String brand) {
		super();
		this.ram = ram;
		this.brand = brand;
	}




	public void makeACall() {
		sim.makeACall();
	}
	
	public void sendText() {
		sim.sendText();
	}
	
	
	
	
}
