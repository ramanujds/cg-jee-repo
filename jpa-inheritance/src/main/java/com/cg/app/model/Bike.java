package com.cg.app.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
//@DiscriminatorValue("Two Wheelers")
public class Bike extends Vehicle{

	private int noOfWheels;
	private String engineType;
	public Bike(long regno, String color, int noOfWheels, String engineType ) {
		super(regno, color);
		this.noOfWheels=noOfWheels;
		this.engineType=engineType;
	}
	
	
	
}
