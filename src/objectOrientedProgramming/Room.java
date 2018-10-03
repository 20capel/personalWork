package objectOrientedProgramming;

import java.util.Scanner;

public class Room {

	public Room() {
	}

	public void area() {
		double length = 2.5;
		double height = 3.5;
		double area = 8.5;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall?");
		length = input.nextDouble();
		System.out.println("What is the height of the wall?");
		height = input.nextDouble();
		area = length * height;
		System.out.println("The area of the wall is " + area);
	}

	public void areaWithDoor() {
		double wallLength = 3.5;
		double wallHeight = 4.5;
		double doorLength = 4.0;
		double doorHeight = 3.2;
		double area = 21.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall?");
		wallLength = input.nextDouble();
		System.out.println("what is the height of the wall?");
		wallHeight = input.nextDouble();
		System.out.println("What is the length of the door?");
		doorLength = input.nextDouble();
		System.out.println("What is the height of the door?");
		doorHeight = input.nextDouble();
		area = (wallLength * wallHeight) - (doorLength * doorHeight);
		System.out.println("The area of the wall without the door is " + area);

	}
}
