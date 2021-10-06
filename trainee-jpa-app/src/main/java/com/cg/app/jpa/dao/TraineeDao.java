package com.cg.app.jpa.dao;

import java.util.List;

import com.cg.app.jpa.model.Trainee;

public interface TraineeDao {

	
	public Trainee addTrainee(Trainee trainee);
	
	public Trainee getTrainee(int id);
	
	public boolean deleteTrainee(int id);
	
	public Trainee updateTrainee(Trainee trainee);
	
	
	public List<Trainee> getAllTrainees();
	public Trainee findTraineeByEmail(String email);
	public Trainee findTraineeByTraineeName(String traineeName);
	
	public Trainee getTraineeByEmailWithNativeQuery(String email);
}
