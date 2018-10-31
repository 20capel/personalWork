package decisions;
import java.util.Scanner;
public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner bartholomew=new Scanner(System.in);
System.out.println("enter a positive integer");
int posInt=bartholomew.nextInt();
int counter=0;
int divisors=0;
for(counter=1;counter<=posInt;counter++){
	if(posInt%counter==0){
		divisors++;
	}
}
System.out.println(divisors);
	}

}
