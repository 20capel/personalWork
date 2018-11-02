package decisions;

import java.util.Scanner;

public class CircleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner albus = new Scanner(System.in);
		int counter = 1;
		double circumference = 0;
		CircleClass bob = new CircleClass();
		double comparison = 0.0;
		do {

			if (counter < 3) {
				System.out.println("Enter radius of a circle");

				double radius1 = albus.nextDouble();
			}
			bob.changeRadius(radius1);
			circumference = bob.circumference();
			if (circumference > comparison) {
				comparison = circumference;
				counter++;
			}
		} while (counter <= 3);
		System.out.println(comparison);
	}

}
