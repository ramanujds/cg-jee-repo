package listdemo;

public class Employee implements Comparable<Employee> {

	private int emplyeeId;
	private String employeeName;
	private float salary;
	
	public Employee() {
	}

	public Employee(int emplyeeId, String employeeName, float salary) {
		super();
		this.emplyeeId = emplyeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmplyeeId() {
		return emplyeeId;
	}

	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emplyeeId=" + emplyeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		
		return (int)(this.salary-emp.salary);
		
	}
	
	
	
	
}
