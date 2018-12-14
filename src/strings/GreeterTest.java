package strings;

import objectOrientedProgramming.Greeter;
import java.util.Scanner;
import java.util.ArrayList;
public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Greeter>array=new <Greeter>ArrayList();
Scanner input=new Scanner(System.in);
int howMany=input.nextInt();
input.nextLine();
for(int counter=0;counter<howMany;counter++){
	System.out.println("Enter name");
	String name=input.nextLine();
	Greeter bob=new Greeter(name);
	array.add(counter,bob);
}

	}

}
