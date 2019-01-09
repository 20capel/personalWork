package strings;

public class Cat implements Animal{
private String name;
private int age;
private boolean friendly;

public void act() {
	age=age+9;
	if(friendly==true) {
		friendly=false;
	}
	else {
		friendly=true;
	}
}
public String toString() {
	return "Cat object, name: "+name+", age: "+age+", friendly? "+friendly;
}
public boolean returnFriendly() {
	return friendly;
}
}
