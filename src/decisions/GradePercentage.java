package decisions;
import java.util.Scanner;
public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter three test scores");
double test1=input.nextDouble();
double test2=input.nextDouble();
double test3=input.nextDouble();
double percentage=(test1+test2+test3)/3;
System.out.println("Your average test score is: "+percentage);
System.out.println("did you do the extra credit?");
int extraCredit=input.nextInt();

	}

}
