package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first = 25;
int second = 36;
int third = 21;
Scanner input = new Scanner(System.in);
System.out.println("What is the first part of your combo?");
first = input.nextInt();
System.out.println("What is the second part of your combo?");
second = input.nextInt();
System.out.println("What is the third part of your combo?");
third = input.nextInt();
System.out.println("Your locker combo is:" + first + "-" + second + "-" + third);

	}

}
