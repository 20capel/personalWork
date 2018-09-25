package mathOperators;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double height=8.0;
double length=5.0;
double width=6.00;
double gallons=2.9;
double area=15;
Scanner input=new Scanner(System.in);
System.out.println("What is the length and height of the room walls in feet?");
length=input.nextDouble();
width=input.nextDouble();
area=2*(length*height+width*height);
gallons=area/150;
System.out.println("The dimensions of the wall are "+length+"x"+height+" and "+width+"x"+height);
System.out.println("The number of gallons needed is "+gallons);
	}

}
