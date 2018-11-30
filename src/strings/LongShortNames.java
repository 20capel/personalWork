package strings;
import java.util.Scanner;
public class LongShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the number of people you know");
int numPeople=input.nextInt();
input.nextLine();
String[] array=new String[numPeople];
int longestLength=0;
int shortestLength=100;
String shortestName="";
String longestName="";
int nameLength=0;
String name="";
for(int counter=0;counter<array.length;counter++) {
	System.out.println("Enter the first and last name of one of the people you know");
	name=input.nextLine();
	array[counter]=name;
	nameLength=array[counter].length()-1;
	if(nameLength<shortestLength) {
		shortestLength=nameLength;
		shortestName=name;
	}
	if(nameLength>longestLength) {
		longestLength=nameLength;
		longestName=name;
	}
}
for(int counter2=0;counter2<array.length;counter2++) {
	System.out.println(array[counter2]);
}
System.out.println(longestName);
System.out.println(shortestName);
System.out.println("Range of lengths: "+shortestLength+"-"+longestLength);
	}

}
