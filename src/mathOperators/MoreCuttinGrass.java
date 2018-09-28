package mathOperators;
import java.util.Scanner;
public class MoreCuttinGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double length=30.0;
double width=45.0;
double widthMower=7.0;
double speedMower=10.0;
final double pay=12.0;
double finalPay=24;
double time=5.0;
Scanner input=new Scanner(System.in);
System.out.println("What is the width of the lawn?");
width=input.nextDouble();
System.out.println("What is the length of the lawn?");
length=input.nextDouble();
System.out.println("What is the width of the mower deck in inches?");
widthMower=input.nextDouble();
System.out.println("What is the speed of the mower in miles per hour?");
speedMower=input.nextDouble();
speedMower=speedMower/63360;
length=length*12;
width=width*12;
time=(width/widthMower)*length*
time=((length*width)/widthMower)*length;
finalPay=time*pay;
System.out.println("The time it will take is "+time+" hours, and the amount you will get is "+pay+" dollars.");

	}

}
