package decisions;
import java.util.Random;
public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random zachary=new Random();
int counter=0;
int multiple=0;
int min=1;
int max=13;
for(counter=1;counter<=87;counter++){
int randomNum=min+zachary.nextInt(max-min+1);
if(randomNum%3==0){
	multiple++;
}
}
System.out.println(multiple);
	}

}
