package strings;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListEmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
ArrayList<Double>array=new ArrayList<Double>();
System.out.println("How many employees?");
double numEmployees=input.nextDouble();
double highestWage=0;
for(int counter=0;counter<numEmployees;counter++){
	System.out.println("enter wage");
	array.add(input.nextDouble());
	
}
for(double wage:array){
	if(wage>highestWage){
		highestWage=wage;
	}
}
System.out.println(highestWage);
	}

}
