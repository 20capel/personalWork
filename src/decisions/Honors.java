package decisions;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Gpa: \nClass:");
		double gpa = input.nextDouble();
		int grade = input.nextInt();
		if (gpa >= 3.5 && grade == 12) {
			System.out.println("Congrats! You graduated with honors!");
		} else {
			System.out.println("Sorry, you didn't graduate with honors.");
		}
	}

}
