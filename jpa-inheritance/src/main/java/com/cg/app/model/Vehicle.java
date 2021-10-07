package com.cg.app.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "Vehicle_Type")
public class Vehicle {

	@Id
	@GeneratedValue
	protected int id;
	protected long regno;
	protected String color;
	
	public Vehicle(long regno, String color) {
		this.regno = regno;
		this.color = color;
	}
	
	
	
}
