package strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner benjamin=new Scanner(System.in);
System.out.println("Enter a word");
String word=benjamin.nextLine();
int counter1=0;
int counter2=0; 
do {
	int wrong=0;
	counter2=word.length()-1;
	for(counter1=0;counter1<word.length();counter1++) {
		
			if(word.charAt(counter1)!=word.charAt(counter2)) {
				wrong++;
			}
		counter2--;
	}
	if(wrong>0) {
		System.out.println("Your word is not a palindrome");
	}
	else {
		System.out.println("Your word is a palindrome");
	}
	System.out.println("Enter another word (999 to quit)");
	word=benjamin.nextLine();
	
}while(word.contains("999")!=true);
	}

}
