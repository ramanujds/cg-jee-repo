package setdemo;

public class Employee  {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + emplyeeId;
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (emplyeeId != other.emplyeeId)
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}

	
//	public int compareTo(Employee emp) {
//		
//		return this.employeeName.compareTo(emp.employeeName);
//		
//	}
	
	
	
	
}
