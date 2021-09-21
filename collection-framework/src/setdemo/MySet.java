package setdemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class MySet {

	public static void main(String[] args) {
		
//		Set<Integer> nums=new TreeSet<>();
//		
//		nums.add(10);
//		nums.add(20);
//		nums.add(5);
//		nums.add(15);
//		nums.add(18);
//		nums.add(18);
//		nums.add(18);
//		
//		System.out.println(nums);
		
	//	Comparator<Employee> sortByName=(e1,e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName());
		
		
		
		Set<Employee> employeeList=new TreeSet<Employee>((e1,e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));
		Employee e1=new Employee(1001, "Tushar", 45000);
		Employee e2=new Employee(1003, "Rahul", 35000);
		Employee e3=new Employee(1002, "Kunal", 55000);
		Employee e4=new Employee(1004, "Abhi", 30000);
		Employee e5=new Employee(1004, "Abhi", 30000);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		
		
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
		

	}

}


