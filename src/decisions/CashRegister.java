package decisions;
import java.util.Scanner;
public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner stanley=new Scanner(System.in);
System.out.println("How many items did you buy?");
int numItems=stanley.nextInt();
int counter=0;
double totalCostNoTax=0;
double itemCost=0;
double totalCost=0;
double tax=0;
for(counter=1;counter<=numItems;counter++){
	System.out.println("What was the cost of an item");
	itemCost=stanley.nextDouble();
	totalCostNoTax=totalCostNoTax+itemCost;
}
System.out.println(totalCostNoTax);
tax=totalCostNoTax*0.05;
System.out.println("tax "+tax);
totalCost=tax+totalCostNoTax;
System.out.println("Your total with tax is "+totalCost);
	}

}
