package decisions;
import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner martha=new Scanner(System.in);
System.out.println("Enter a positive integer");
int posInt=martha.nextInt();
int counter=0;
int sum=0;
for(counter=1;counter<posInt;counter=counter+2){
	sum=counter+sum;
}
System.out.println(sum);
	}

}
