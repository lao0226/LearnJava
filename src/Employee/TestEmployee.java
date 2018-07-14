package Employee;

public class TestEmployee {

	public static void main(String args[]) {
		//construct two employee objects
		Employee Jack=new Employee("Jack", 5000);
		Employee Tom=new Employee("Tom",5000);
		
		//output the name and salary
		System.out.println(Jack.getName()+"'s salary is "+Jack.getSalary());
		System.out.println(Tom.getName()+"'s salary is "+Tom.getSalary());
		
		//change the salary of two objects
		Jack.setSalary(7000);
		Tom.setSalary(8000);
		
		//output the info of two subjects
		System.out.println("The new salary for Tom is "+Tom.getSalary());
		System.out.println("The new Salary for Jack is "+Jack.getSalary());
		
		//output the total number of employee objects
		Employee Daniel=Tom;
		System.out.println("The total number of employee is "+Employee.getTotalNum());
	}
}
