package decisions;
import java.util.Random;
public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random millie=new Random();
double counter=0;
int min=1;
int max=2;
int heads=0;
int tails=0;
for(counter=1;counter<=1000000000;counter++){
	int randomNum=min+millie.nextInt(max-min+1);
	if(randomNum==1){
	heads++;	
	}
	else{
	tails++;
	}
}
System.out.println("heads "+heads);
System.out.println("tails "+tails);
	}

}
