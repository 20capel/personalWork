package strings;
import java.util.Scanner;
public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Friend[] array=new Friend[5];
String name="";
int age=0;
for(int counter=0;counter<array.length;counter++) {
	System.out.println("Enter the name, then the age of a friend");
	name=input.nextLine();
	age=input.nextInt();
	input.nextLine();
	array[counter]=new Friend(name,age);
}
for(int counter2=4;counter2>=0;counter2--) {
	System.out.println(array[counter2].getName());
	System.out.println(array[counter2].getAge());
}
	}

}
