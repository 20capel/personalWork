package strings;
import java.util.Random;
public class TwoDArrayFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
Friend[][] array=new Friend[18][5];
int min=0;
int max=100;
int age=0;
for(int row=0;row<array.length;row++){
	for(int column=0;column<array[0].length;column++){
		array[row][column]=new Friend();
		age=min+generator.nextInt(max-min+1);
		array[row][column].setAge(age);
		System.out.print(array[row][column].getAge()+" ");	
	}
	System.out.println();
}
	}

}
