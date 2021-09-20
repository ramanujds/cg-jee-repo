package mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import listdemo.Employee;

public class MapDemo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		Map<Integer, String> map = new HashMap<>();
//		
//		map.put(1, "One");
//		map.put(2, "Two");
//		map.put(10, "Ten");
//		
//		int key;
//		System.out.println("Enter key : ");
//		key=scan.nextInt();
//		
//		String value=map.get(key);
//		
//		System.out.println("Value = "+value);
		
		
		Map<Integer, Employee> employees=new TreeMap<>();
		
		Employee e1=new Employee(1001, "Tushar", 45000);
		Employee e2=new Employee(1003, "Rahul", 35000);
		Employee e3=new Employee(1002, "Kunal", 55000);
		Employee e4=new Employee(1004, "Abhi", 30000);
		
		employees.put(e4.getEmplyeeId(), e4);
		employees.put(e3.getEmplyeeId(), e3);
		employees.put(e2.getEmplyeeId(), e2);
		employees.put(e1.getEmplyeeId(), e1);
	
		
//		int key;
//		System.out.println("Enter key : ");
//		key=scan.nextInt();
//		
//		Employee value=employees.get(key);
//		
//		System.out.println("Value = "+value);
		
		for(int key:employees.keySet()) {
			System.out.println(employees.get(key));
		}
		
	}
	
}
