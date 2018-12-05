package strings;
import java.util.Scanner;
import java.util.Random;
public class RollingDiceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
System.out.println("Enter num of students in class");
int numStudents=input.nextInt();
System.out.println("Enter num of sides on die");
int numSides=input.nextInt();
System.out.println("enter num of times each student roll die");
int numTimes=input.nextInt();
int[][]array=new int[numStudents][numTimes];
for(int counter=0;counter<numStudents;counter++){
	for(int counter2=0;counter2<numTimes;counter2++){
		int randomNum=1+generator.nextInt(numSides-1+1);
		array[counter][counter2]=randomNum;
		System.out.print(array[counter][counter2]+" ");
	}
	System.out.println();
}
	}

}
