package strings;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
ArrayList<Circle>array=new ArrayList<Circle>();
for(int counter=0;counter<10;counter++){
	System.out.println("Enter the radius of a circle");
	Circle bob=new Circle(input.nextDouble());
	array.add(bob);
}
for(Circle area:array){
	System.out.println(area.area());
}
	}

}
