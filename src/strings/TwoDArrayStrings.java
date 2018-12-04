package strings;
import java.util.Scanner;
public class TwoDArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] array=new String[4][3];
Scanner input=new Scanner(System.in);
String name="";
for(int row=0;row<array.length;row++){
	for(int column=0;column<array[0].length;column++){
		System.out.println("Enter a name");
		name=input.nextLine();
		array[row][column]=name;
	}
}
for(int row2=0;row2<array.length;row2++){
	for(int column2=0;column2<array[0].length;column2++){
		System.out.print(array[row2][column2].length()-1+" ");
	}
	System.out.println();
}

	}

}
