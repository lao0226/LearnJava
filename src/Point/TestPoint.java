package Point;

public class TestPoint {

	public static void main(String args[]) {
		Point a=new Point();
		Point b=new Point(5,10);
		
		System.out.println(a.getX()+" , "+a.getY());
		System.out.println(b.getX()+" , "+b.getY());
		System.out.println(a.distanceFrom(b));
	}
}
