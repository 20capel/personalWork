package decisions;
import java.util.Scanner;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner dory=new Scanner(System.in);
System.out.println("How many students took the test?");
int numStudents=dory.nextInt();
double classAverage=0;
double classSum=0;
double testScore=0;
int counter=0;
for(counter=1;counter<=numStudents;counter++){
	System.out.println("What did a student get on the test");
	testScore=dory.nextDouble();
	classSum=testScore+classSum;
}
classAverage=classSum/numStudents;
System.out.println(classAverage);
	}

}
