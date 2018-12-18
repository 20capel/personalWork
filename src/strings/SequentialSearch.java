package strings;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
ArrayList<Integer>scores=new <Integer>ArrayList();
boolean ifScore=false;
for(int j=0;j<1000;j++){
	int randomNum=0+generator.nextInt(1600-0+1);
	scores.add(randomNum);
}
System.out.println("Enter an SAT score");
int score=input.nextInt();

for(int x:scores){
	if(x==score){
		ifScore=true;
	}
}
System.out.println(ifScore);
	}

}
