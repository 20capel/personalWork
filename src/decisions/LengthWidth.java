package decisions;
import java.util.Scanner;
public class LengthWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Give a length and width of a rectangle");
int length=input.nextInt();
int width=input.nextInt();
System.out.println("Enter 0 in to find the perimeter or 1 for the area");
int number=input.nextInt();
if(number==0){
	int perimeter=(2*length)+(2*width);
	System.out.println(perimeter);
}
else{
	int area=(length*width);
	System.out.println(area);
}
	}

}
