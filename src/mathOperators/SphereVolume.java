package mathOperators;
import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double radius=2.4;
final double pi=3.14;
double volume=13.0;
Scanner input=new Scanner(System.in);
System.out.println("What is the radius of the sphere?");
radius=input.nextDouble();
volume=(4.0/3.0)*pi*(radius*radius*radius);
System.out.println("The area of the sphere = " + volume + ".");
	}

}
