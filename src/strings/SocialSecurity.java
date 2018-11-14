package strings;
import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner slimshady=new Scanner(System.in);
System.out.println("Enter your social security number with no dashes");
String number=slimshady.nextLine();
System.out.println(number.substring(5,9));
System.out.println(number.substring(3,5));
System.out.println(number.substring(0,3));
}
	}


