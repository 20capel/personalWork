package decisions;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double testAverage = input.nextDouble();
		System.out.println("What is your homework average?");
		double homeworkAverage = input.nextDouble();
		System.out.println("Is your teacher nice or not?\n1.My teacher is nice\n2.My teacher is mean");
		int meanNice = input.nextInt();
		if (meanNice == 1) {
			if (testAverage > homeworkAverage) {
				System.out.println(testAverage);
			} else {
				System.out.println(homeworkAverage);
			}
		} else {
			if (testAverage < homeworkAverage) {
				System.out.println(testAverage);
			} else {
				System.out.println(homeworkAverage);
			}
		}

	}
}
