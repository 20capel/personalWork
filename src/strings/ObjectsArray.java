package strings;
import java.util.Scanner;
public class ObjectsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
String name="";
String[] array=new String[10];
String lastName="";
int averageLength=0;
int index=0;
for(int counter=0;counter<array.length;counter++) {
	System.out.println("Enter the full name of a teacher");
	name=input.nextLine();
	array[counter]=name;
	index=array[counter].indexOf(" ");
	lastName=array[counter].substring(index+1);
	averageLength=averageLength+lastName.length();
}
averageLength=averageLength/10;
System.out.println(averageLength);

	}

}
