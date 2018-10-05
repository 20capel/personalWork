package objectOrientedProgramming;

public class NumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers lee = new Numbers();
		lee.sayNumber(7.5);
		lee.sayNumberPlus2(7.5);
		lee.saySum(7.5,9.5);
		double thing=lee.returnSquare(8.0);
		//8.0 squared (64) becomes stored as lee.returnSquare
		//so you have to have the returnSquare declared as an object variable
		//and then output that variable
		System.out.println(thing);
		double answer=lee.returnArea(5.0,4.0);
		System.out.println(answer);
		double round=lee.returnRoundUp(7.5);
		System.out.println(round);
	}

}
