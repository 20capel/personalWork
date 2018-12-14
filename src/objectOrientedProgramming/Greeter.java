package objectOrientedProgramming;

public class Greeter {
private String name;
	public Greeter()
	{
		name="Loutis";
	}
	public Greeter(String xName){
		name=xName;
	}
	public void sayHello()
	{
		name="Lotus";
		System.out.println("Hello "+name);
	}
	public void sayHello(String xName){
		name=xName;
		System.out.println("Hello "+name);
	}
}
