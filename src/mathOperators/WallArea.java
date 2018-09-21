package mathOperators;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int height=8;
int width=4;
int area=32;
Scanner input=new Scanner(System.in);
System.out.println("What is the width of the wall?");
width=input.nextInt();
area=height*width;
System.out.println("The area of the wall is " +area+".");

	}

}
