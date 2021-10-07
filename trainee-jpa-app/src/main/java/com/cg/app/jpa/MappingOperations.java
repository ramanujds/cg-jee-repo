package com.cg.app.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.app.jpa.model.Laptop;
import com.cg.app.jpa.model.Trainee;

public class MappingOperations {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("trainee-persistence");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		
		Laptop laptop1 = new Laptop("Macbook",8);
		Laptop laptop2 = new Laptop("HP",16);
		
		Trainee trainee = new Trainee("Tushar","tushar@yahoo.com",65000);
		laptop1.setTrainee(trainee);
		laptop2.setTrainee(trainee);
		trainee.getLaptops().add(laptop1);
		trainee.getLaptops().add(laptop2);
		
		transaction.begin();
		entityManager.persist(laptop1);
		entityManager.persist(laptop2);
		entityManager.persist(trainee);
		
		transaction.commit();
		
//		Trainee trainee=entityManager.find(Trainee.class, 3);
//		
//		System.out.println(trainee);
		
		
		
		
	}

}
