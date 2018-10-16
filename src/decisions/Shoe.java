package decisions;
import java.util.Scanner;
public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("What is your height and shoe size?");
double height=input.nextDouble();
double shoeSize=input.nextDouble();
System.out.println(height+shoeSize>=26.0);
	}

}
