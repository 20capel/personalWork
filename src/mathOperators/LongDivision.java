package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dividend=12;
int divisor=4;
int quotient=3;
int remainder=2;
Scanner input=new Scanner(System.in);
System.out.println("What is the dividend?");
dividend=input.nextInt();
System.out.println("What is the divisor?");
divisor=input.nextInt();
quotient=dividend/divisor;
remainder=dividend%divisor;

System.out.println("The quotient is "+quotient+" and the remainder is "+remainder);

	}

}
