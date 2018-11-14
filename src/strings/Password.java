package strings;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner mateo=new Scanner(System.in);
System.out.println("Enter a password");
String password=mateo.nextLine();
int counter=0;
String newPassword="hi";
do{
System.out.println("Enter your password");
newPassword=mateo.nextLine();	
}
while(newPassword.compareTo(password)!=0);
	}

}
