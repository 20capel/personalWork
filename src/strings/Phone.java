package strings;

public class Phone {
private static int companyProductNumber=0;
private int productNumber;
private long myNumber;
private static int maxMinutes=10000;
private int minutesUsed;

public Phone(long phoneNum, int xMinutesUsed) {
	if(phoneNum<=999999999) {
		myNumber=phoneNum;
	}
	else {
		myNumber=1234567890;
	}
	if(xMinutesUsed<=10000) {
		minutesUsed=xMinutesUsed;
	}
	else {
		minutesUsed=50;
	}
	productNumber=companyProductNumber;
	companyProductNumber++;
}
public void makeCall(int numMinutes) {
	if(minutesUsed+numMinutes<=10000&&numMinutes>=0) {
	minutesUsed=minutesUsed+numMinutes;
	}
}

}
