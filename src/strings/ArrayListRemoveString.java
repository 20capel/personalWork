package strings;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListRemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> students=new <String> ArrayList();
Scanner input=new Scanner(System.in);
System.out.println("how many students");
int numStudents=input.nextInt();
input.nextLine();
String name="";
for(int counter=0;counter<numStudents;counter++){
	System.out.println("Enter a student name");
	name=input.nextLine();
	students.add(counter,name);
}
students.remove(0);
students.remove(students.size()-1);

for(int counter=0;counter<students.size();counter++){
	System.out.println(students.get(counter));
}
	}

}
