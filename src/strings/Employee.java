package strings;

public class Employee {
	private double ratePay;
	private String name;

	public Employee() {
		name = "mimi";
		ratePay = 7.25;
	}
	public Employee(String xName,double pay){
		ratePay=pay;
		name=xName;
	}

	public double calculatePay(int xHours) {
		double pay = xHours * ratePay;
		return pay;
	}

	public double getRatePay() {
		return ratePay;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Object xObject) {
		return this.toString().equals(xObject);
	}
}
