package strings;
import java.util.ArrayList;
import java.util.Random;
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
ArrayList<Phone>phoneInfo=new ArrayList<Phone>();
int randomNum=0+generator.nextInt(999999999-0+1);
int randomMin=0+generator.nextInt(10000-0+1);
int randomLength=0+generator.nextInt(10-0+1);
for(int i=0;i<20;i++) {
	phoneInfo.add(new Phone(randomNum,randomMin));
}
for(int i=0;i<20;i++) {
	for(int k=0;k<300;k++) {
		phoneInfo.get(i).makeCall(randomLength);
	}
}
	}

}
