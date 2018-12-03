package strings;
import java.util.Random;
public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int min=1;
int max=1;
int sum=0;
int[][] array=new int[3][7];
for(int rows=0;rows<array.length;rows++){
	for(int columns=0;columns<array[0].length;columns++){
		array[rows][columns]=min+generator.nextInt(max-min+1);
		sum+=array[rows][columns];
		System.out.print(array[rows][columns]);
	}
	System.out.println();

}
System.out.println(sum);
	}

}
