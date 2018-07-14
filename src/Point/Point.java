package Point;

public class Point {

	//instance variable
	private double x;
	private double y;
	
	//constructor
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(double a, double b) {
		x=a;
		y=b;
	}
	
	//method
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distanceFrom(Point a) {
		double diff_x=this.x-a.x;
		double diff_y=this.y-a.y;
		return Math.sqrt(diff_x*diff_x+diff_y*diff_y);
	}
	
}
