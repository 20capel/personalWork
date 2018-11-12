package decisions;
import java.util.Scanner;
public class PetsGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
/*
System.out.println("How many pets are in your house and how many cars fit in your garage?");
int pets=input.nextInt();
int cars=input.nextInt();
System.out.println(pets>=5||cars>3);
*/
System.out.println("Test score 1: \nTest score 2:");
double testOne=input.nextDouble();
double testTwo=input.nextDouble();
if(testOne>testTwo){
	System.out.println("Great job!");
	System.out.println(testOne-testTwo);
}
System.out.println("Have a nice day.");
	}

}
