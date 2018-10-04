package objectOrientedProgramming;

public class Numbers {

	public Numbers() {
	}

	public void sayNumber(double num) {
		// accessSpecifier returnType methodName(parameter,parameter)
		System.out.println("You sent "+num+" to the method.");
	}
	public void sayNumberPlus2(double number){
		number=number+2;
		System.out.println("Your number plus 2 is "+number);
	}
	public void saySum(double num, double number){
	num=num+number;
	System.out.println("The sum of your two numbers is: "+num);
	}
}
