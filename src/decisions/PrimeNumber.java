package decisions;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner theodore=new Scanner(System.in);
System.out.println("enter a number");
double num=theodore.nextDouble();
int counter=0;
int divisors=0;
for(counter=1;counter<=num;counter++){
	if(num%counter==0){
		divisors++;
	}
}
if(divisors>2){
	System.out.println("Your number is not a prime number");
}
else{
	System.out.println("Your number is a prime number");
}
	}

}
