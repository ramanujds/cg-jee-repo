package com.cg.app.jpa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String brand;
	
	private int ram;
	
	@ManyToMany(mappedBy = "laptops")
	private List<Trainee> trainees;
	
	public Laptop() {
	}

	public Laptop(String brand, int ram) {
		super();
		this.brand = brand;
		this.ram = ram;
	}
	
	


	public List<Trainee> getTrainees() {
		if(trainees==null) {
			trainees=new ArrayList<Trainee>();
		}
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", ram=" + ram + "]";
	}
	
	
	
	
	
	

}
