package objectOrientedProgramming;

public class Circle {
	private double radius;

	public Circle() {
		radius = 5.0;
	}

	public Circle(double nowRadius) {
		radius = nowRadius;
	}

	public void setRadius(double nowRadius) {
		radius = nowRadius;
	}

	public double getRadius() {
		return radius;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
	public void changeRadius(double newRadius){
		radius=newRadius;
	}
}
