package mathOperators;
import java.util.Scanner;
public class CuttinGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double width=1.00;
double length=4.00;
double area=4.00;
double radius=2.00;
double moneyOwed=5.50;
Scanner input=new Scanner(System.in);
System.out.println("What is the length?");
length=input.nextDouble();
System.out.println("What is the width?");
width=input.nextDouble();
System.out.println("What is the radius of the fountain?");
radius=input.nextDouble();
area=width*length;
area=area-(3.14*radius*radius);
moneyOwed=(area/100)*1.25;
System.out.println("The money owed for cutting grass is "+moneyOwed+" dollars.");

	}

}
