package decisions;
import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("How much money did you receive for your fifteenth birday?");
double money=input.nextDouble();
double epsilon=0.001;
if(Math.abs(money-Math.sqrt(84.3))<=epsilon){
	System.out.println("You got the good prize");
}
else{
	System.out.println("You got the bad prize");
}
	}

}
