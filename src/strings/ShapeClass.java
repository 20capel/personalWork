package strings;
import java.util.ArrayList;
public class ShapeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double totalArea=0;
double smallestPer=10000;
RectClass bob=new RectClass(5,4);
CircleClass ted=new CircleClass(6);
RectClass barbara=new RectClass(8,3);
CircleClass bub=new CircleClass(4);
RectClass bobb=new RectClass(7,2);
CircleClass tude=new CircleClass(9);
ArrayList<Shape>objects=new ArrayList<Shape>();
objects.add(bob);
objects.add(ted);
objects.add(barbara);
objects.add(bub);
objects.add(bobb);
objects.add(tude);
for(int i=0; i<6;i++){
	totalArea=totalArea+objects.get(i).area();
	if(objects.get(i).perimeter()<smallestPer){
		smallestPer=objects.get(i).perimeter();
	}
}
System.out.println(totalArea);
System.out.println(smallestPer);
}}
