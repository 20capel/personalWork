package strings;
import java.util.Random;
import java.util.Scanner;
public class RollDieArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
int min=1;
int max=6;
int randomNum=min-generator.nextInt(max-min+1);
int[] array=new int[10000];
int counter=0;
for(counter=0;counter<array.length;counter++) {
	array[counter]=randomNum;
}
System.out.println("Enter a roll number");
int rollNumber=input.nextInt();
System.out.println(array[rollNumber]);
while (rollNumber!=999){
	System.out.println("Enter a roll number (999 to quit)");
	rollNumber=input.nextInt();
	System.out.println(array[rollNumber]);
}
	}

}
