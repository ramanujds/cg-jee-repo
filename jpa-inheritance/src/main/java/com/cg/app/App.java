package com.cg.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.app.model.Bike;
import com.cg.app.model.Car;
import com.cg.app.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("vehicle-persistence");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
    	Vehicle bike = new Bike(727272, "Black", 2, "Hybrid");
    	
    	Vehicle car = new Car(565656,"Red",4,"JBL");
    	
    	transaction.begin();
    	entityManager.persist(bike);
    	entityManager.persist(car);
    	transaction.commit();
    	
    	
    	
    	
    }
}
