package strings;

public class Parallelogram extends Quadrilateral{
	private double height;
public Parallelogram(){
	super();
	height=3;
}
public Parallelogram(double s1,double s2,double ht){
	super(s1,s2,s1,s2);
	height=ht;
}
public double perimeter(){
	return super.perimeter();
}
public double area(){
	return height*super.getS1();
}
}
