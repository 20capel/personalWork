package strings;
import java.util.Random;
public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int min=1;
int max=1;
int sum=0;
int[][][] array=new int[3][7][9];
for(int counter=0;counter<3;counter++){
	for(int counter2=0;counter2<7;counter2++){
		for(int counter3=0;counter3<9;counter3++){
			array[counter][counter2][counter3]=min+generator.nextInt(max-min+1);
			sum+=array[counter][counter2][counter3];
		}
	}
}
System.out.println(sum);
	}

}
