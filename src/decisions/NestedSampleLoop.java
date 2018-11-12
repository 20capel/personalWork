package decisions;
import java.util.Scanner;
public class NestedSampleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner billy=new Scanner(System.in);
int counter=0;
int counter2=0;
int sum=0;
int newSum=0;
int integer=0;
System.out.println("Enter a positive integer");
int posInt=billy.nextInt();
for(counter=2;counter<=posInt;counter=counter+2){
	if(posInt%counter==0){
		sum=sum+counter;
	}
}
System.out.println(sum);
do{
	System.out.println("Enter a positive integer (999 to quit)");
	integer=billy.nextInt();
	newSum=0;
	for(counter2=2;counter2<=integer;counter2=counter2+2){
		if(integer%counter2==0){
			newSum=newSum+counter2;
		}
	}
	System.out.println(newSum);
}while(integer!=999);
	}

}
