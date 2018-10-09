package objectOrientedProgramming;

public class Employee {
	private double wage;
	private int experience;
public Employee(){
	wage =20.0;
	experience=0;
}
public double getWage(){
	return wage;
}
public void setWage(double nowWage){
	wage=nowWage;
	}
public int getExperience(){
	return experience;
}
public void setExperience(int nowExperience){
	experience=nowExperience;
}
}
