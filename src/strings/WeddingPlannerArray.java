package strings;
import java.util.Scanner;
public class WeddingPlannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the number of people attending the wending (multiple of 8)");
int numPeople=input.nextInt();
numPeople=numPeople/8;
Friend[][]array=new Friend[numPeople][8];
Friend bob=new Friend();
String name="";
int age=0;
for(int counter=0;counter<array.length;counter++) {
	for(int counter2=0;counter2<array[0].length;counter2++) {
		System.out.println("Enter the name, then age of one guest");
		name=input.nextLine();
		input.nextLine();
		age=input.nextInt();
		
	}
}
	}

}
