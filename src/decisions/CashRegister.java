package decisions;
import java.util.Scanner;
public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner stanley=new Scanner(System.in);
System.out.println("How many items did you buy?");
int numItems=stanley.nextInt();
int counter=0;
double totalCost=0;
for(counter=1;counter<=numItems;counter++){
	System.out.println("What was the cost of an item");
	totalCost=stanley.nextDouble();
	
}
	}

}
