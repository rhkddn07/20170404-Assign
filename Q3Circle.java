package sys;

public class Q3Circle {
	public double radius;
	public static double PI = 3.141592;
	
	public Q3Circle (double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
}
