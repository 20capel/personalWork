package strings;
import java.util.Scanner;
public class ReverseNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int numNames=5;
String[] names=new String[numNames];
for(int counter=0;counter<names.length;counter++){
	System.out.println("Enter a name");
	names[counter]=input.nextLine();
}
System.out.println("Enter a letter");
	String letter=input.nextLine();
for(int counter2=0;counter2<names.length;counter2++){
	int nameLength=names[counter2].length();
	String lastLetter=names[counter2].substring(nameLength-1);
	if(lastLetter.equals(letter)){
		System.out.println(names[counter2]);
	}
}
	}}



