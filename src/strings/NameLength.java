package strings;
import java.util.Scanner;
public class NameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int numNames=5;
String[] names=new String[numNames];
System.out.println("Enter a length");
int length=input.nextInt();//
for(int counter=0;counter<names.length;counter++){
	System.out.println("Enter a name");
	names[counter]=input.nextLine();
	int nameLength=names[counter].length();
	if(nameLength==length){
		System.out.println(names[counter]);
	}
}
	}

}
