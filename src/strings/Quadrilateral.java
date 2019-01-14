package strings;

public class Quadrilateral {
private double s1;
private double s2;
private double s3;
private double s4;

public Quadrilateral(){
	s1=2.0;
	s2=3.0;
	s3=4.0;
	s4=5.0;
}
public Quadrilateral(double side1,double side2,double side3,double side4){
	s1=side1;
	s2=side2;
	s3=side3;
	s4=side4;
}
public void setSides(double side1,double side2,double side3,double side4){
	s1=side1;
	s2=side2;
	s3=side3;
	s4=side4;
}
public double getS1(){
	return s1;
}
public double getS2(){
	return s2;
}
public double getS3(){
	return s3;
}
public double getS4(){
	return s4;
}
public double perimeter(){
	double perimeter=s1+s2+s3+s4;
	return perimeter;
}
public String toString(){
	return "Quadrilateral: perimeter= "+perimeter()+", side1= "+getS1()+", side2= "+getS2()+", side3= "+getS3()+", side4= "+getS4();
}
public boolean equals(Object xObject){
	return this.toString().equals(xObject);
}
}
