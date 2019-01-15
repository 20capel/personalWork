package strings;

public class Worker extends Employee {
	private int yearsExperience;

	public Worker() {
		super();
		yearsExperience = 3;
	}

	public Worker(String name, double pay) {
		super();
	}

	double pay = 0;

	public double calculatePay(int xHours) {
		if (yearsExperience > 10) {
			pay = (super.getRatePay() * xHours) + ((super.getRatePay() * (double) xHours) * 0.20);
		} else {
			pay = super.getRatePay() * xHours;
		}
		return pay;
	}

	public String toString() {
		return "Worker: years experience= " + yearsExperience + ", rate pay= " + super.getRatePay() + ", name= "
				+ super.getName();
	}
}
