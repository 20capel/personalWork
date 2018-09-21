package inputExamples;
import java.util.Scanner;
public class AgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 10;
double weight = 130.0;
Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
age = input.nextInt();
System.out.println("How much do you weigh?");
weight = input.nextDouble();
System.out.println("You are " + age + " years old and weigh " + weight + " pounds");


	}

}
