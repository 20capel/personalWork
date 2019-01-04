package strings;
import java.util.Scanner;
public class RectInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter a length and width of a rectangle");
double length=input.nextDouble();
double width=input.nextDouble();
InterfaceName thing=new RectClass(length,width);
System.out.println(thing.area()+" "+thing.perimeter());
System.out.println("Enter the radius of a circle");
double radius=input.nextDouble();
InterfaceName newThing=new CircleClass(radius);
System.out.println(newThing.area()+" "+newThing.perimeter());
	}

}
