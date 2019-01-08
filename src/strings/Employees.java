package strings;

import java.util.Random;

public class Employees {
	private String name;
	private double rate;
	private int[] hours = new int[52];
	private static int classNumber = 0;
	private int employeeNumber;

	public Employees() {
		name = "Markus";
		rate = 6.0;
		Random generator = new Random();
		for (int i = 0; i < hours.length; i++) {
			hours[i] = 0 + generator.nextInt(40 - 0 + 1);
		}
		employeeNumber = classNumber;
		classNumber++;
	}

	public void modifyRate(double xRate) {
		rate = xRate + rate;
	}

	public double calcPay(int weekNumber) {
		int hoursWorked = hours[weekNumber - 1];
		return (double) hoursWorked * rate;
	}

}
