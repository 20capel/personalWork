package mathOperators;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double change=2.40;
double dollars=2;
double quarters=3;
double dimes=1;
double nickels=1;
double pennies=2;
Scanner input=new Scanner(System.in);
System.out.println("How much change is needed?");
change=input.nextDouble();
dollars=(int)change;
change%=1;
quarters=(change/0.25);
change%=0.25;
dimes=change/0.1;
change%=0.1;
nickels=change/0.05;
change%=0.05;
pennies=change/0.01;
change%=0.01;

System.out.println("You will need "+(int)dollars+" dollars, "+(int)quarters+" quarters, "+(int)dimes+" dimes, "+(int)nickels+" nickels, and "+(int)Math.ceil(pennies)+" pennies.");
input.close();
	}

}
