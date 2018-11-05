package decisions;
import java.util.Random;
public class RussianFishingVillage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random dumbledore=new Random();
int min=26;
int max=43;
int heights=0;
int counter=0;
for(counter=1;counter<=248;counter++){
	int randomNum=min+dumbledore.nextInt(max-min+1);
	if(randomNum>36){
	heights++;
	}
}
System.out.println(heights);
	}

}
