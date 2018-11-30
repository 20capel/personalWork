package strings;
import java.util.Scanner;
public class TestScoresArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
double testScore=0;
double[] array=new double[10];
double highest=0;
double lowest=100;
double average=0;
for(int counter=0;counter<array.length;counter++) {
	System.out.println("Enter test score");
	testScore=input.nextDouble();
	array[counter]=testScore;
	if(testScore<lowest) {
		lowest=testScore;
	}
	if(testScore>highest) {
		highest=testScore;
	}
	average=average+testScore;
}
System.out.println(highest);
System.out.println(lowest);
average=average/10.0;
System.out.println(average);
for(int counter2=0;counter2<array.length;counter2++) {
	System.out.println(array[counter2]);
}
	}

}
