package strings;
import java.util.Random;
public class HundredRectanglesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method
Random generator=new Random();
Rectangle[] rectangle=new Rectangle[100];
int smallest=rectangle[0].area();
int randomNum=10+generator.nextInt(10+56-1);
for(int counter=0;counter<rectangle.length;counter++){
	Rectangle hundred=new Rectangle(randomNum,randomNum);
	rectangle[counter]=hundred;
	if(hundred.area()<smallest){
		smallest=hundred.area();
	}
	
}
System.out.println("Length: ");
	}

}
