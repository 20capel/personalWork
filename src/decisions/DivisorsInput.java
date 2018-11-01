package decisions;
import java.util.Scanner;
public class DivisorsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner betty=new Scanner(System.in);
System.out.println("enter a positive integer");
int posInt=betty.nextInt();
int counter=0;
int divisors=0;
int counter2=0;
int mostDivisors=0;
int largestInt=0;
for(counter=1;counter<=posInt;counter++){
	divisors=0;
	for(counter2=1;counter2<=counter;counter2++){
		if(counter%counter2==0){
			divisors++;
		}
	if(divisors>mostDivisors){
		mostDivisors=divisors;
	largestInt=counter;
	}
	
}

}
System.out.println(largestInt);
	}

}
