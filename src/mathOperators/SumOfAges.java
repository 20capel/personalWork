package mathOperators;
import java.util.Scanner;
public class SumOfAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ageOne=2;
int ageTwo=3;
int ageThree=4;
Scanner input=new Scanner(System.in);
System.out.println("What are the ages of three of your friends?");
ageOne=input.nextInt();
ageTwo=input.nextInt();
ageThree=input.nextInt();
ageThree=ageOne+ageTwo+ageThree;
System.out.println("The sum of your friends is "+ageThree+".");

	}

}
