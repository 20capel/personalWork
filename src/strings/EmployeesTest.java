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
for(int i=0;i<numEmployees;i++){
	employeeInfo.add(new Employees());
}
System.out.println("test");
employeeInfo.get(numEmployees-1).modifyRate(raise);
for(int i=0;i<numEmployees;i++){
	System.out.println(employeeInfo.get(i).calcPay(7));
}
System.out.println("test2");
for(int i=0;i<numEmployees;i++){
	for(int j=0;j<52;j++){
		totalMoney=totalMoney+employeeInfo.get(i).calcPay(j);
		System.out.println(totalMoney);
	}
}
	}

}
