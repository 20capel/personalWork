package strings;
import java.util.Random;
public class HundredRectanglesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
Random generator=new Random();
Rectangle[] rectangle=new Rectangle[100];

for(int counter=0;counter<rectangle.length;counter++){
	int randomNum=10+generator.nextInt(10+56-1);
	Rectangle hundred=new Rectangle(randomNum,randomNum);
	rectangle[counter]=hundred;
	System.out.println("Length: "+hundred.getLength()+"Width: "+hundred.getWidth());
}
	}

}
