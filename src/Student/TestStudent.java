package Student;

public class TestStudent {

	public static void main(String args[]) {
		//construct student objects
		Student Tom=new Student("Tom Ye");
		Student Jack=new Student("Jack Zhao",15);
		Student Zed=new Student("Zed Li",32);
		
		//print out the name and credit
		System.out.println(Tom.getName()+": "+Tom.getCredit());
		System.out.println(Jack.getName()+": "+Jack.getCredit());
		System.out.println(Zed.getName()+": "+Zed.getCredit());
		
		//Three students all completed a course and earned 6 credits
		Tom.addCredit(6);
		Jack.addCredit(6);
		Zed.addCredit(6);
		
		//print out the name and credit
		System.out.println(Tom.getName()+": "+Tom.getCredit());
		System.out.println(Jack.getName()+": "+Jack.getCredit());
		System.out.println(Zed.getName()+": "+Zed.getCredit());
		
		//see who can graduate
		if(Tom.canGraduate()) {
			System.out.println("Tom can grauduate.");
		}
		if(Jack.canGraduate()) {
			System.out.println("Jack can graduate.");
		}
		if(Zed.canGraduate()) {
			System.out.println("Zed can graduate.");
		}
	}
}
