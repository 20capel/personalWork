package decisions;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("How much money do you make in a year?");
int salary=input.nextInt();
if(salary<20000){
	System.out.println("You must be a worker");
}
else{
	if(salary<=40000){
		System.out.println("You must be a manager");
	}
	else{
		if(salary<=100000){
		System.out.println("You must be a CEO");
	}
		else{
			System.out.println("You must be an owner");
		}
	}
}
	}

}
