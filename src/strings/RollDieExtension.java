package strings;
import java.util.Scanner;
import java.util.Random;
public class RollDieExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
int min=1;
int max=6;

int[] array=new int[10000];
int rollNumber=0;
for(int counter=0;counter<array.length;counter++) {
	int randomNum=min-generator.nextInt(max-min+1);
	array[counter]=randomNum;
}
System.out.println("Enter a roll number");
rollNumber=input.nextInt();
for(int counter2=0;counter2<array.length;counter2++) {
	if(array[counter2]==array[rollNumber]) {
		System.out.println(counter2);
	}
}
do{ 
	System.out.println("Enter a roll number (999 to quit)");
	rollNumber=input.nextInt();
	for(int counter3=0;counter3<array.length;counter3++) {
		if(array[counter3]==array[rollNumber]) {
			System.out.println(counter3);
		}
	}
}while(rollNumber!=999);
	}

}
