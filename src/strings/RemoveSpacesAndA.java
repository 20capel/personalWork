package strings;
import java.util.Scanner;
public class RemoveSpacesAndA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner slimshady=new Scanner(System.in);
System.out.println("Enter a sentence");
String sentence=slimshady.nextLine();
int counter=0;
String space=" ";
for(counter=0;counter<sentence.length();counter++){
	if(sentence.charAt(counter)!=' '&&sentence.charAt(counter)!='a'){
		System.out.println(sentence.charAt(counter));
	}
			
		
		
	}
}
	
	}


