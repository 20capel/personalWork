package mathOperators;
import java.util.Scanner;
public class MonthDayYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month=4;
int day=18;
int year=2002;
Scanner input=new Scanner(System.in);
System.out.println("Enter the month:");
month=input.nextInt();
System.out.println("Enter the day:");
day=input.nextInt();
System.out.println("Enter the year:");
year=input.nextInt();
System.out.println(month+"-"+day+"-"+year);

	}

}
