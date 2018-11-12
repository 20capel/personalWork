package decisions;

import java.util.Random;

public class FleepCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random fleep = new Random();
		int counter = 1;
		int min = 1;
		int max = 2;
		double heads = 0;
		double largest = 0;
		double smallest = 10;
	
		for (counter = 1; counter <= 100; counter++) {
			for (int counter2 = 1; counter2 <= 10; counter2++) {
				int randomNum = min + fleep.nextInt(max - min + 1);
				if (randomNum == 1) {
					heads++;
				}

			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}
