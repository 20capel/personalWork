package objectOrientedProgramming;

public class Worker {
	private int numberHours;
	private double ratePay;
//default constructor below
	public Worker(){
		numberHours = 5;
		ratePay = 8.50;
	}
//alternate constructor below
public Worker(int newNumberHours,double newRatePay){
	numberHours=newNumberHours;
	ratePay=newRatePay;
}
public void setWorker(int newNumberHours,double newRatePay){
	numberHours=newNumberHours;
	ratePay=newRatePay;
}
public int getHours(){
	return numberHours;
}
public double getRate(){
	return ratePay;
}
public double payCheck(){
	return numberHours*ratePay;
}
public void raise(double higherPay){
	ratePay=ratePay+higherPay;
}
}
