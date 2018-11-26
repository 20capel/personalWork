package strings;
import java.util.Scanner;
import java.util.Random;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner eminem=new Scanner(System.in);
Random beyonce=new Random();
int min=0;
int max=1000;
int largest=0;
int randomNum=min+beyonce.nextInt(max-min+1);
int counter=0;
int counter2=5;
double[] scores=new double[5];
for(counter=0;counter<250;counter++){
	scores[counter]=randomNum;
	if(randomNum>largest){
		largest=randomNum;
	}
}
System.out.println(largest);
}
	}


