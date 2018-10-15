package objectOrientedProgramming;

import java.util.Scanner;

public class Car {

	public Car() {
	}

	public void sayOdometer() {
		int miles = 8;
		Scanner input = new Scanner(System.in);
		System.out.println("How many miles have you driven your car?");
		miles = input.nextInt();
		System.out.println("You have traveled " + miles + " miles.");
	}

	public void sayFlat() {
		System.out.println("Your car has a flat tire!");
	}

	public void sayThirsty() {
		System.out.println("Your car is also out of gas!");
	}
}
