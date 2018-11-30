package strings;
import java.util.Scanner;
import java.util.Random;
public class ArrayPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
int min=7;
int max=20;
int[] array=new int[100];
System.out.println("Enter value (7-852) you would like to display");
int value=input.nextInt();
int times=1;
int average=value;
for(int counter=0;counter<array.length;counter++) {
	int randomNum=min-generator.nextInt(max-min+1);
	array[counter]=randomNum;
	if(array[counter]==value) {
		System.out.println(array[counter]);
	}
}
do {
	System.out.println("Enter another value (999 to quit)");
	value=input.nextInt();
	for(int counter2=0;counter2<array.length;counter2++) {
		int randomNum=min-generator.nextInt(max-min+1);
		array[counter2]=randomNum;
		if(array[counter2]==value) {
			System.out.println(array[counter2]);
		}
		average=average+value;
		times++;
	}
}while(value!=999);
average=average/times;
System.out.println(average);
	}

}
