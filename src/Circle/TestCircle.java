package Circle;

public class TestCircle {

	public static void main(String args[]) {
		Circle c1=new Circle();
		Circle c2=new Circle(5);
		
		System.out.println("The radius of the circle one is "+c1.getRadius());
		System.out.println("The radius of the circle two is "+c2.getRadius());
		System.out.println("The area of the first circle is "+c1.getArea());
		System.out.println("The area of the second circle is "+c2.getArea());
		System.out.println("The perimeter of the first circle is "+c1.getPerimeter());
		System.out.println("The perimeter of the second circle is "+c2.getPerimeter());
		
		c1.setRadius(10);
		System.out.println("The radius of the circle one is "+c1.getRadius());
		
	}
}
