package objectOrientedProgramming;
import java.util.Scanner;
public class House {

	public House(){
	}
public void paintWall(){
	Scanner input=new Scanner(System.in);
	System.out.println("What is the length and height of the wall in feet?");
	double length=input.nextDouble();
	double height=input.nextDouble();
	double area=length*height;
	
}
}
