package com.cg.app.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Car extends Vehicle{

	private int noOfWheels;
	private String musicSystem;
	public Car(long regno, String color, int noOfWheels, String musicSystem) {
		super(regno, color);
		this.noOfWheels=noOfWheels;
		this.musicSystem=musicSystem;
		// TODO Auto-generated constructor stub
	}
	
	
	
}
