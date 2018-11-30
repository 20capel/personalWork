package strings;
import java.util.Scanner;
import java.util.Random;
public class CrazySale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
double[] array=new double[5];
double cost=0;
int min=0;
int max=100;
for(int counter=0;counter<array.length;counter++) {
	System.out.println("Enter the cost of one item");
	cost=input.nextDouble();
	array[counter]=cost;
}
for(int counter2=0;counter2<array.length;counter2++) {
	int randomNum=min-generator.nextInt(max-min+1);
	randomNum=randomNum/100;
	array[counter2]=array[counter2]-(array[counter2]*randomNum);
	System.out.println(array[counter2]);
}
	}

}
