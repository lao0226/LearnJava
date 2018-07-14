package Employee;

public class Employee {

	//instance variable and static variable
	private String name;
	private double salary;
	private static int totalNumOfEmployees=0;
	
	//constructor
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
		totalNumOfEmployees++;
	}
	
	//method
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
	public static int getTotalNum() {
		return totalNumOfEmployees;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
}
