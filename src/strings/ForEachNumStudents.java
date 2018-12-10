package strings;
import java.util.Scanner;
public class ForEachNumStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("How many students in class?");
int numStudents=input.nextInt();
double[] array=new double[numStudents];
double averageAge=0;
for(int counter=0;counter<array.length;counter++){
	System.out.println("Enter age of one student");
	array[counter]=input.nextDouble();
	
}
for(double age : array){
	averageAge=averageAge+age;
}
System.out.println(averageAge/(double)numStudents);
	}

}
