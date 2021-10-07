package com.cg.app.jpa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trainee_info")
@NamedQuery(name = "find-by-trainee-name", query = "from Trainee where traineeName=:traineeName")
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "trainee_name", length = 30)
	private String traineeName;
	
	
	@Column(unique = true)
	private String email;
	
	private float salary;
	
//	@OneToOne
//	private Laptop laptop;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "trainee")
	List<Laptop> laptops;
	
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}


	public Trainee( String traineeName, String email, float salary) {
		super();
		
		this.traineeName = traineeName;
		this.email = email;
		this.salary = salary;
	}

	
	

	

	public List<Laptop> getLaptops() {
		if(laptops==null) {
			laptops=new ArrayList<Laptop>();
		}
		return laptops;
	}


	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Trainee [id=" + id + ", traineeName=" + traineeName + ", email=" + email + ", salary=" + salary
				+  "]";
	}


	
	
	
	
}
