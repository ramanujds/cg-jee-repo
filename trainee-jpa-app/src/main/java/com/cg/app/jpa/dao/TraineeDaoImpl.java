package com.cg.app.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.app.jpa.model.Trainee;

public class TraineeDaoImpl implements TraineeDao {
	
	private EntityManagerFactory factory;
	
	private EntityManager entityManager;
	
	private EntityTransaction transaction;
	
	
	public TraineeDaoImpl() {
		
		factory=Persistence.createEntityManagerFactory("trainee-persistence");
		entityManager=factory.createEntityManager();
		transaction=entityManager.getTransaction();
		
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		transaction.begin();
		entityManager.persist(trainee);
		transaction.commit();
		return trainee;
	}

	@Override
	public Trainee getTrainee(int id) {
		return entityManager.find(Trainee.class, id);
	}

	@Override
	public boolean deleteTrainee(int id) {
		
		transaction.begin();
		Trainee trainee = entityManager.find(Trainee.class, id);
		if(trainee==null) {
			return false;
		}
		entityManager.remove(trainee);
		transaction.commit();
		return entityManager.find(Trainee.class, id)==null;
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		transaction.begin();
		entityManager.merge(trainee);
		transaction.commit();
		return trainee;
		
	}

	@Override
	public List<Trainee> getAllTrainees() {
		
		Query query=entityManager.createQuery("from Trainee");
		List<Trainee> trainees= query.getResultList();
		return trainees;
	}

}
