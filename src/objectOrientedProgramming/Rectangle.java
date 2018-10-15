package objectOrientedProgramming;

public class Rectangle {
	private double length;
	private double width;

	// default constructor below
	public Rectangle() {
		length = 9.0;
		width = 3.0;
	}

	// alternate constructor below
	public Rectangle(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}

	public void setLength(double newLength) {
		length = newLength;
	}

	public void setWidth(double newWidth) {
		width = newWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter() {
		return 2 * length + 2 * width;
	}

	public double area() {
		return length * width;
	}

	public void changeRectangle(double newNewLength, double newNewWidth) {
		length = newNewLength;
		width=newNewWidth;
	}
}
