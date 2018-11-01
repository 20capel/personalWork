package decisions;

public class CircleClass {
private double radius;
public CircleClass(){
	radius=4.5;
}
public CircleClass(double newRadius){
	radius=newRadius;
}
public double returnRadius(){
	return radius;
	}
public double circumference(){
	double circumference=2*Math.PI*radius;
	return circumference;
}
public double area(){
	double area=Math.PI*radius*radius;
	return area;
}
public void changeRadius(double newRadius){
	radius=newRadius;
}
}
