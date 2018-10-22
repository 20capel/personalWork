package decisions;

import java.util.Scanner;

public class BooleanPracticeAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your favorite value:");
		boolean value = input.nextInt() > 13;
		System.out.println(value);
System.out.println("Enter your second favorite value:");
int value2=input.nextInt();
if(value2>10){
	System.out.println("bad job");
}
else{
	if(value2==10){
	System.out.println("fabulous job");
}
	else{
	System.out.println("not good");
	}
	}
}
}
