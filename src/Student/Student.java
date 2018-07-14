package Student;

public class Student {

	//instance variable
	private String name;
	private int credit;
	
	//static variable
	private static int gradCredit=28;
	
	//constructor
	public Student(String name) {
		this.name=name;
		credit=0;
	}
	
	public Student(String name,int credit) {
		this.name=name;
		this.credit=credit;
	}
	
	//methods
	public String getName() {
		return name;
	}
	
	public int getCredit() {
		return credit;
	}
	
	public void addCredit(int credit) {
		this.credit+=credit;
	}
	
	public boolean canGraduate() {
		if(credit>gradCredit) {
			return true;
		}
		else {
			return false;
		}
	}
}
