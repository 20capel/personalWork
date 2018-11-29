package strings;
import java.util.Scanner;
import java.util.Random;
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
System.out.println("Enter a sentence");
String sentence=input.nextLine();
System.out.println("Enter a keyword");
String keyWord=input.nextLine();
String[]word=sentence.split(" ");
int min=0;
int max=word.length-1;
int randomNumber=min-generator.nextInt(max-min+1);
int numAppears=0;
for(int counter=0;counter<word.length;counter++){
	System.out.println(word[counter].charAt(0));
}
for(int counter2=0;counter2<word.length;counter2++){
	if(word[counter2].equals(keyWord)){
		numAppears++;
	}
}
System.out.println(numAppears);
System.out.println(word[randomNumber]);
	}

}
