package strings;
import java.util.Scanner;
public class TwoNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner dorothy=new Scanner(System.in);
System.out.println("Enter two names");
String name1=dorothy.nextLine();
String name2=dorothy.nextLine();
int name=name1.compareToIgnoreCase(name2);
if(name<0){
	System.out.println(name1.toUpperCase());
}
else{
	if(name==0){
		System.out.println("That's the same name bro");
	}
	else{
		System.out.println(name2.toUpperCase());
	}
}
	}

}
