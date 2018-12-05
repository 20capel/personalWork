package strings;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> array=new ArrayList<String>();
Scanner input=new Scanner(System.in);
System.out.println("Enter a name");
String name=input.nextLine();
array.add("Bob");
array.add("Leroy");
array.add(0,"Greg");
array.add(7,"Joe");
array.add(array.size()-1,name);
	}

}
