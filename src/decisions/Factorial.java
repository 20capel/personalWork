package decisions;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner gregory=new Scanner(System.in);
System.out.println("Enter a positive integer");
int posInt=gregory.nextInt();
int counter=0;
int factorial=1;
for(counter=1;counter<=posInt;counter++){
	factorial=counter*factorial;
}
System.out.println(factorial);
	}

}
