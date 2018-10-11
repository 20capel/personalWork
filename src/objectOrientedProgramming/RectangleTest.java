package objectOrientedProgramming;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle mark=new Rectangle(7.0,5.0);
System.out.println("length is "+mark.getLength());
System.out.println("width is "+mark.getWidth());
System.out.println("perimeter is "+mark.perimeter());
System.out.println("area is "+mark.area());
mark.changeRectangle(4.0,2.0);
System.out.println("new length and width is "+mark.getLength()+", "+mark.getWidth());
	}

}
