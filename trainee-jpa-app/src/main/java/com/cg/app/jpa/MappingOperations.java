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
		Laptop laptop3 = new Laptop("Dell",16);
		
		Trainee trainee = new Trainee("Tushar","tushar@yahoo.com",65000);
		
		Trainee trainee2=new Trainee("Javed", "javed@yahoo.com", 72000);
		
		trainee.getLaptops().add(laptop1);
		trainee.getLaptops().add(laptop2);
		
		trainee2.getLaptops().add(laptop1);
		trainee2.getLaptops().add(laptop3);
		
		laptop1.getTrainees().add(trainee);
		laptop1.getTrainees().add(trainee2);
		laptop2.getTrainees().add(trainee);
		laptop3.getTrainees().add(trainee2);
		
		transaction.begin();
		entityManager.persist(laptop1);
		entityManager.persist(laptop2);
		entityManager.persist(laptop3);
		entityManager.persist(trainee);
		entityManager.persist(trainee2);
		transaction.commit();
		
//		Trainee trainee=entityManager.find(Trainee.class, 3);
//		
//		System.out.println(trainee);
		
		
		
		
	}

}
