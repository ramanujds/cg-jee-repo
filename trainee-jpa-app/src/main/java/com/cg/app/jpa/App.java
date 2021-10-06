package com.cg.app.jpa;

import java.util.List;

import com.cg.app.jpa.dao.TraineeDao;
import com.cg.app.jpa.dao.TraineeDaoImpl;
import com.cg.app.jpa.model.Trainee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TraineeDao dao=new TraineeDaoImpl();
    	
//    	Trainee trainee = new Trainee(1002,"Mahesh","mahesh@gmail.com",40000);
//    	Trainee savedTrainee = dao.addTrainee(trainee);
//    	System.out.println(savedTrainee);
        
//        Trainee trainee=dao.getTrainee(1002);
//        System.out.println(trainee);
//        boolean isDeleted=dao.deleteTrainee(1002);
//       System.out.println(isDeleted); 
        
        
//        Trainee trainee=new Trainee(1001,"Tushar","tushar@gmail.com",60000);
//        
//        Trainee savedTrainee = dao.updateTrainee(trainee);
//        
//        System.out.println(savedTrainee);
        
        List<Trainee> trainees=dao.getAllTrainees();
        
        trainees.forEach(System.out::println);
    	
    }
}
