package decisions;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
System.out.println("Enter three values:");
int one=input.nextInt();
int two=input.nextInt();
int three=input.nextInt();
if(one>two&&one>three){
	System.out.println(one);
}
if(two>one&&two>three){
	System.out.println(two);
}
if(three>one&&three>two){
	System.out.println(three);
}
System.out.println(one);
	}

}
