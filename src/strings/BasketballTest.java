package strings;

public class BasketballTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Ball bobby=new Basketball();
//ball is referencing a sub class object(Basketball)
Basketball bob=new Basketball();
bob.method1();
bob.method2();
bob.method3();
//always start from the outside in, the methods are being used inside of Basketball
//polymorphism says always work from outside in
Storage mimi=new Storage();
// can call of the 
Box mo=new Box();
//
	}

}
