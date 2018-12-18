package strings;
import java.util.Random;
import java.util.Scanner;
public class ArraySequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
int numInteger=0;
int[]numbers=new int[5];
for(int j=0;j<numbers.length;j++){
	int randomNum=0+generator.nextInt(499-0+1);
	numbers[j]=randomNum;
	System.out.println(numbers[j]);
}

System.out.println("Enter an integer");
int integer=input.nextInt();
for(int x:numbers){
	if(x==integer){
		numInteger++;
	}
}
System.out.println(numInteger);
	}

}
