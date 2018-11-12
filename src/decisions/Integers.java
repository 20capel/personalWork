package decisions;
import java.util.Scanner;
public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int counter=0;
for(counter=1;counter<=5;counter=counter+1){
	System.out.println(counter);
}*/
/*int counter=0;
for(counter=1;counter<=10;counter++){
	System.out.println(counter+" Hello");
}*/
/*int counter=0;
for(counter=1;counter<=19;counter=counter+2){
	System.out.println(counter+" Hello");
}*/
/*int counter=0;
for(counter=15;counter<=60;counter=counter+5){
	System.out.println(counter+" Hello");
}*/
/*int counter=0;
for(counter=10; counter>=1;counter=counter-1){
	System.out.println(counter+" Hello");
}*/
/*int counter=0;
Scanner nonia=new Scanner(System.in);
System.out.println("How many Hello's would you like?");
int hello=nonia.nextInt();
if(hello<0){
	hello=3;
}
for(counter=1;counter<=hello;counter++){
	System.out.println(counter+" Hello");
}*/
/*int counter=0;
Scanner mathilda=new Scanner(System.in);
System.out.println("What's your favorite number?");
int fav=mathilda.nextInt();
for(counter=1;counter<=10;counter++){
	System.out.println(fav+" Hello");
}*/
/*int counter=0;
int total=0;
for(counter=1; counter<=10; counter++){
	total=counter+total;
}
System.out.println(total);*/
/*int counter=0;
int number=0;
int total=0;
Scanner geranimo=new Scanner(System.in);
for(counter=1;counter<=5;counter=counter+1){
	System.out.println("Enter a number");
	number=geranimo.nextInt();
	total=number+total;
}
System.out.println(total);
	}*/
/*int counter=0;
int number=0;
for(number=1; number<=4;number++){
for(counter=1; counter<=5; counter++){
	System.out.println(counter*number);
}
			}*/
/*int counter=0;
int number=0;
for(number=1; number<=4;number++)
for(counter=1;counter<=5;counter++){
	if(counter!=3){
	System.out.println(counter);}
	else{
		System.out.println(number);
	}
	
}*/
int divisors=0;	
int divisors2=0;
int counter=0;
int number=1;
for(counter=1;counter<=1000;counter++)
for(counter=1;counter<=number; counter++){
	if(number%counter==0)
	divisors++;	
	number++;
	if(divisors<divisors2)
		System.out.println(divisors2);
	}
System.out.println(divisors);
}}