package mathOperators;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=0;
int yearsVote=18;
Scanner input=new Scanner(System.in);
System.out.println("What is your age?");
age=input.nextInt();
yearsVote=18-age;
System.out.println("It will be " +yearsVote+ " years until you can vote.");

	}

}
