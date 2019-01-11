package strings;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;

public Trapezoid(){
	super();
	height=4;
}
public Trapezoid(double largeb,double smallb,double leg1,double leg2,double ht){
	super(largeb,smallb,leg1,leg2);
	height=ht;
}
public double perimeter(){
	return super.perimeter();
}
public double area(){
return(0.5*(super.getS1()+super.getS2())*height);
}
}
