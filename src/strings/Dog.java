package strings;

import java.util.Random;

public class Dog {
	private String name;
	private int age;
	private boolean injured;

public void act() {
	Random generator=new Random();
	injured=false;
	age=age+7;
	int randomNum=1+generator.nextInt(50-1+1);
	if(randomNum==1) {
		injured=true;
	}
}
public String toString() {
	return "Dog object, name: "+name+", age: "+age+", injured? "+injured;
}
public void vet() {
	injured=false;
}
}
