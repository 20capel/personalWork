package decisions;
import java.util.Scanner;
public class HeightShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Display your height in inches and shoe size: ");
int height=input.nextInt();
int shoeSize=input.nextInt();
System.out.println(height<62&&shoeSize>9);
	}

}
