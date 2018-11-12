package strings;
import java.util.Scanner;
public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner mathilda=new Scanner(System.in);
System.out.println("Enter a name");
String name1=mathilda.nextLine();
System.out.println("Enter another name");
String name2=mathilda.nextLine();
if(name1.compareTo(name2)==0){
	System.out.println("The two names are identical!");}
else{
	if(name1.compareTo(name2)<0){
		System.out.println(name1+", "+name2);
	}
	else{
		System.out.println(name2+", "+name1);
	}
	
}
	}

}
