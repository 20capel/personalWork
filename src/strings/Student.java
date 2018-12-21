package strings;
import java.util.ArrayList;
public class Student {
	private String name;
	private ArrayList<Integer>tests;
	private int howMany;
public Student(){
	name="Leah";
	tests=new ArrayList<Integer>();
	for(int i=0;i<5;i++){
		tests.add(50);
	}
	howMany=4;}
public Student(String xName){
	name=xName;
}
public void addaScore(int xScore){
	if(xScore<0){
		xScore=50;
	}
	tests.add(xScore);
	howMany++;
}
public double averageScore(){
	double total=0;
	for(int i=0;i<tests.size();i++){
		total=total+(double)tests.get(i);}
	double average=total/(double)tests.size();
	return average;
	}
public int lowestScore(){
	int lowestScore=10000;
	for(int i=0;i<tests.size();i++){
		if(tests.get(i)<lowestScore){
			lowestScore=tests.get(i);
		}
	}
	return lowestScore;
}
public String toString(){
	return("Student:"+name+" "+howMany);
}
public Object clone(){
	return new Student(name);
}
public boolean equals(Object xObject){
	return this.toString().equals(xObject.toString());  
}
}
