package decisions;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner zeus=new Scanner(System.in);
System.out.println("what is the temperature outside?");
int temp=zeus.nextInt();
if(temp<=-10){
	System.out.println("Go inside and find a fire before you freeze to death");
}
else{
	if(temp<=35){
		System.out.println("It's the perfect time to go snow shoeing!");
	}
	else{
		if(temp<=74){
			System.out.println("Even though it's boring as heck, go golfing");
		}
		else{
			if(temp<=83){
				System.out.println("Go play tennis");
			}
			else{
				System.out.println("To prevent yourself from melting, go swimming");
			}
		}
	}
	
}
	}

}
