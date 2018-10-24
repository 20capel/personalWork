package decisions;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner gertrude=new Scanner(System.in);
System.out.println("Enter an integer");
int integer=gertrude.nextInt();
do{
	int product=integer*17;
	System.out.println(product);
	System.out.println("Enter an integer (9999 to quit)");
	integer=gertrude.nextInt();
}while(integer!=9999);
	
	}

}
