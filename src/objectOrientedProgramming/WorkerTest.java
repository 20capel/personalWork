package objectOrientedProgramming;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Worker mark=new Worker(5,9.0);
System.out.println("Your number of hours is "+mark.getHours());
System.out.println("Your hourly rate is "+mark.getRate());
System.out.println("Your check will be "+mark.payCheck());

	}

}
