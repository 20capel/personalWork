package strings;
import java.util.ArrayList;
import java.util.Random;
public class ArrayListRectangleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
		ArrayList<Rectangle> rectangle=new <Rectangle>ArrayList();
for(int counter=0;counter<400;counter++){
	int randomNum=50+generator.nextInt(70-50+1);
	Rectangle variable=new Rectangle(randomNum,randomNum);
	rectangle.add(counter,variable);
}
Rectangle junk=rectangle.remove(0+generator.nextInt(399-0+1));
System.out.println(junk.getLength());
for(int counter=rectangle.size()-1;counter>=0;counter--){
	System.out.println(rectangle.get(counter).area());
}
Rectangle bob=rectangle.remove(rectangle.size()-1);
rectangle.set(0, bob);

	
}
	}

}
