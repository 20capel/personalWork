package strings;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
double totalMoney=0;
System.out.println("Enter the number of employees");
int numEmployees=input.nextInt();
ArrayList<Employees>employeeInfo=new ArrayList<Employees>();
System.out.println("Give dollar amount for raise");
double raise=input.nextDouble();
for(int i=0;i<numEmployees-1;i++){
	employeeInfo.add(new Employees());
}
employeeInfo.get(numEmployees-1).modifyRate(raise);
for(int i=0;i<numEmployees-1;i++){
	System.out.println(employeeInfo.get(i).calcPay(7));
}
for(int i=0;i<numEmployees-1;i++){
	for(int j=0;j<53;j++){
		totalMoney=totalMoney+employeeInfo.get(i).calcPay(j);
		System.out.println(totalMoney);
	}
}
	}

}
