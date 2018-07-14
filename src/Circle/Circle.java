package Circle;

public class Circle {

	//instance variable
	private double radius;
	
	//constructor
	public Circle() {
		radius=0;
	}
	
	public Circle(double r) {
		radius=r;
	}
	
	//method
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public void setRadius(double r) {
		radius=r;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}
