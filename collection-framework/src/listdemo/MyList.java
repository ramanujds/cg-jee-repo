package listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyList {
	
	public static void main(String[] args) {
//		List<Integer> myList = new ArrayList<>();
//		
//		myList.add(20);
//		myList.add(10);
//		myList.add(30);
//		myList.add(60);
//		myList.add(40);
//		
//		Collections.sort(myList);
//		
//		System.out.println(myList);
		
//		List<String> names=Arrays.asList("Tushar","Rahul","Kunal","Abhi");
//		Collections.sort(names);
//		System.out.println(names);
		
		Scanner scan= new Scanner(System.in);
		
		List<Employee> employeeList=new ArrayList<>();
		
		Employee e1=new Employee(1001, "Tushar", 45000);
		Employee e2=new Employee(1003, "Rahul", 35000);
		Employee e3=new Employee(1002, "Kunal", 55000);
		Employee e4=new Employee(1004, "Abhi", 30000);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		System.out.println("Enter employee id : ");
		int id=scan.nextInt();
		Employee searchedEmplyee=null;
		for(Employee emp:employeeList) {
			if(emp.getEmplyeeId()==id) {
				searchedEmplyee=emp;
				break;
			}
		}
		
		System.out.println(searchedEmplyee);
		
		
//		Collections.sort(employeeList);
//		
//		for(Employee emp:employeeList) {
//			System.out.println(emp);
//		}
//		
		
		
//		
//		Comparator<Employee> sortById = new SortById();
//		
//		
//		System.out.println("Sort By ID ");
//		Collections.sort(employeeList, sortById);
//		
//		for(Employee emp:employeeList) {
//			System.out.println(emp);
//		}
		
	}

	
	
	
	
	
}


class SortById implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmplyeeId()-e2.getEmplyeeId();
	}
}
