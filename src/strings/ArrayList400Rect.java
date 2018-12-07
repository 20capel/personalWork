package strings;
import java.util.Random;
import java.util.ArrayList;
public class ArrayList400Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
ArrayList <Rectangle> rectangle=new <Rectangle> ArrayList();
for(int counter=0;counter<400;counter++){
	int randomNum=50+generator.nextInt(70-50+1);
	Rectangle variable=new Rectangle(randomNum,randomNum);
	rectangle.add(counter,variable);}

	for(int counter=rectangle.size()-1;counter>=0;counter--){
		System.out.println(rectangle.get(counter).area());
	}

}}
