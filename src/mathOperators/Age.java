package mathOperators;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =10;
Scanner input=new Scanner(System.in);
System.out.println("What is your age?");
age=input.nextInt();
age=age+7;
System.out.println("You will be " +age+ " in 7 years.");
	}

}
