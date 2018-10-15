package objectOrientedProgramming;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle ball=new Circle(3.0);
System.out.println("ball radius:"+ball.getRadius());
System.out.println("ball circumference:"+ball.circumference());
System.out.println("ball area "+ball.area());
ball.changeRadius(7.0);
System.out.println("new radius:"+ball.getRadius());
	}

}
