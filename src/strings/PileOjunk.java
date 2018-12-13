package strings;
import java.util.Random;

public class PileOjunk {
private static int idNumber=1000;
private int myId;
private int randomInt;

public static int returnSum(int one, int two){
	return one+two;
}
public PileOjunk(){
	Random generator=new Random();
	randomInt=10+generator.nextInt(100-10+1);
	myId=idNumber;
	idNumber++;
}
public void setRandom(int randomInt){
	this.randomInt=randomInt;
}
}
