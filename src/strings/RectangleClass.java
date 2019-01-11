package strings;

public class RectangleClass extends Parallelogram implements Geo{
public RectangleClass(){
	super();
}
public RectangleClass(double length,double width){
	super(length,width,width);
	//*or super.setSides(length,width,length,width);*//
}
public double area(){
	return super.getS1()*super.getS2();
}
}
