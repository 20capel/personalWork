package strings;
import java.util.Scanner;
public class FriendTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter how many friends you have");
int numFriends=input.nextInt();
String name="";
int age=0;
int averageLength=0;
String[] array=new String[numFriends];
for(int counter=0;counter<array.length;counter++) {
	System.out.println("Enter the first name of one friend, and then their age");
	name=input.nextLine();
	input.nextLine();
	array[counter]=name;
	age=input.nextInt();
	averageLength=averageLength+array[counter].length();
}
averageLength=averageLength/numFriends;
System.out.println(averageLength);
	}

}
