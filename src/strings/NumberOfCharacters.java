package strings;
import java.util.Scanner;
public class NumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner milly=new Scanner(System.in);
/*System.out.println("Enter a sentence");
String sentence=milly.nextLine();
System.out.println(sentence.length());
int length=sentence.length();
int counter=0;
for(counter=0;counter<=(length-1);counter++){
	System.out.println(sentence.charAt(counter));
}*/
String text="My name is Buzz Lightyear!";
for(int i=0; i<text.length();i++){
	System.out.println(text.substring(i));
}
	}
}
