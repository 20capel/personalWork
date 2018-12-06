package strings;
import java.util.Scanner;
public class ArrayWeddingPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the number of people at the wedding (multiple of 4)");
int numPeople=input.nextInt();
input.nextLine();
String name="";
int age=0;
int index=0;
Friend[][]array=new Friend[numPeople/4][4];
for(int row=0;row<numPeople/4;row++){
	for(int column=0;column<4;column++){
		System.out.println("Enter the name, then age of one person");
		name=input.nextLine();
		input.nextLine();
		age=input.nextInt();

		array[row][column]=new Friend(name,age);
	}
}
for(int row=0;row<numPeople;row++){
	for(int column=0;column<4;column++){
		index=(array[row][column].getName()).indexOf(" ");
		System.out.print((array[row][column].getName()).substring(index+1)+" ");
	}
	System.out.println();
}
for(int row=0;row<numPeople/4;row++){
	for(int column=0;column<4;column++){
		System.out.print(array[row][column].getName()+" ");
	}
	System.out.println();
}

	}

}
