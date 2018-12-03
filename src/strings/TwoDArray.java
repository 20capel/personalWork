package strings;
import java.util.Random;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int min=0;
int max=100;

int[][] array=new int[14][9];
for(int rows=0;rows<array.length;rows++){
	for(int columns=0;columns<array[0].length;columns++){
		array[rows][columns]=min+generator.nextInt(max-min+1);
		System.out.print(array[rows][columns]+" ");
	}
	System.out.println();
}
	}

}
