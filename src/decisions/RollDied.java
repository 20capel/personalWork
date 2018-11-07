package decisions;
import java.util.Scanner;
import java.util.Random;
public class RollDied {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner zelda=new Scanner(System.in);
Random link=new Random();
System.out.println("How many sides are on the die? How many somersault rolls are you doing?");
int sides=zelda.nextInt();
int somersaultRolls=zelda.nextInt();
int min=1;
int max=sides;
int counter=0;
for(counter=1;counter<=somersaultRolls;counter++){
	int randomNum=min+link.nextInt(max-min+1);
	System.out.println(randomNum);
	}
	
	}

	}


