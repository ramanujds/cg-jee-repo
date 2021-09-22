package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		
//	Writing an Object	
//
//		try {
//			FileOutputStream outputStream=new FileOutputStream("employee.data");
//			
//			ObjectOutputStream objStream=new ObjectOutputStream(outputStream);
//			
//			
//			Employee emp1=new Employee(1001,"Mahesh Dutta",65000);
//		
//			objStream.writeObject(emp1);
//		
//		
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
// Reading an Object
		
		try {
			FileInputStream inputStream=new FileInputStream("employee.data");
			ObjectInputStream objInputStream=new ObjectInputStream(inputStream);
			
			Employee emp=(Employee)objInputStream.readObject();
			System.out.println(emp);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
