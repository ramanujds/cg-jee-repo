package com.cg.app.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.app.jpa.App;
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
		Trainee oldTrainee=entityManager.find(Trainee.class, trainee.getId());
		oldTrainee.setEmail(trainee.getEmail());
		oldTrainee.setSalary(trainee.getSalary());
		oldTrainee.setTraineeName(trainee.getTraineeName());
		//entityManager.persist(trainee);
		transaction.commit();
		return trainee;
		
	}

	@Override
	public List<Trainee> getAllTrainees() {
		
		Query query=entityManager.createQuery("from Trainee");
		List<Trainee> trainees= query.getResultList();
		return trainees;
	}
	
	public Trainee findTraineeByEmail(String email) {
//		Query query=entityManager.createQuery("from Trainee where email=:email");
//		query.setParameter("email", email);
//		
//		return (Trainee) query.getSingleResult();
		
//		Typed Query
		
		TypedQuery<Trainee> query=entityManager.createQuery("from Trainee where email=:email",Trainee.class);
		
		query.setParameter("email", email);
		
		return query.getSingleResult();
		
		
		
		
	}
	
	
	// Named Query
	
	public Trainee findTraineeByTraineeName(String traineeName) {
		TypedQuery<Trainee> query=entityManager.createNamedQuery("find-by-trainee-name", Trainee.class);
		
		query.setParameter("traineeName", traineeName);
		
		return query.getSingleResult();
	}
	
	// Native Query
	
	public Trainee getTraineeByEmailWithNativeQuery(String email) {
		
		Query query=entityManager.createNativeQuery("select * from trainee_info where email=:email", Trainee.class);
		
		query.setParameter("email", email);
		
		return (Trainee)query.getSingleResult();
		
		
	}
	
	

}
