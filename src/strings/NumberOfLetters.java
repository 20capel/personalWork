package strings;
import java.util.Scanner;
public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner petunia=new Scanner(System.in);
System.out.println("Enter a sentence");
String sentence=petunia.nextLine();
int numVowels=0;
int counter=0;
for(counter=0; counter<sentence.length();counter++) {
	if(sentence.charAt(counter)=='a'||sentence.charAt(counter)=='e'||sentence.charAt(counter)=='i'||sentence.charAt(counter)=='o'||sentence.charAt(counter)=='u'||sentence.charAt(counter)=='y') {
	numVowels++;	
	}
}
System.out.println("There are "+numVowels+" vowels");
	}

}
