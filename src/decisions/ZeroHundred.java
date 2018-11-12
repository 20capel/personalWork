package decisions;

import java.util.Scanner;

public class ZeroHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int count=0; while(count<=100){ System.out.println(count); count ++;
		 * }
		 */
		/*
		 * int multiple=0; while(multiple<=100000){
		 * System.out.println(multiple); multiple=multiple+2; }
		 */
		/*
		 * int multiple=0; Scanner input=new Scanner(System.in);
		 * System.out.println("Enter an even value"); int end=input.nextInt();
		 * int sum=0; while(multiple<=end){ sum=sum+multiple;
		 * multiple=multiple+2; } System.out.println(sum);
		 */
		/*int value = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter integer");
		value = input.nextInt();
		while (value != 9999) {
			value = value * 2;
			System.out.println("your number times two is " + value);
			System.out.println("enter integer");
			value = input.nextInt();
		}
		*/
/*double num=0;
double sum=0;
Scanner input=new Scanner(System.in);
System.out.println("enter a double (9999 to quit)");
num=input.nextDouble();
while(num!=9999){
	sum=sum+num;
	System.out.println("enter double (9999 to quit");
	num=input.nextDouble();
}
System.out.println("sum = "+sum);
*/
/*double num=0;
double sum=0;
double entered=0;
Scanner input=new Scanner(System.in);
System.out.println("enter double value (9999 to quit)");
num=input.nextDouble();
while(num!=9999){
	sum=sum+num;
	entered=entered +1;
	System.out.println("enter double (9999 to quit)");
	num=input.nextDouble();
}
entered=sum/entered;
System.out.println("average="+entered);
*/
double num=0;
double largest=0;
Scanner input=new Scanner(System.in);
System.out.println("enter a double (9999 to quit)");
num=input.nextDouble();
while(num!=9999){
	System.out.println();
	if(num>largest){
		
	}
}
	}

}
