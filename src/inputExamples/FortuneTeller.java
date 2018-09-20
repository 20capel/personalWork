package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int weight = 130;
int age = 21;
int luckyNumber = 13;
Scanner input = new Scanner(System.in);
System.out.println("Enter your weight:");
weight = input.nextInt();
System.out.println("Enter your age:");
age = input.nextInt();
System.out.println("Enter your lucky number:");
luckyNumber = input.nextInt();
System.out.println("In the the future... \nI see... \n" + luckyNumber + " years from now... \nYou will be reside number " + age + weight + " at the old folks home.");



	}

}
