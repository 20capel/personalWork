package decisions;

import java.util.Scanner;
import java.util.Random;

public class RollDiedTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cookie = new Scanner(System.in);
		Random chocoTaco = new Random();
		System.out.println("How many times would you like to sommersaultroll your die?");
		int sommersaultRolls = cookie.nextInt();
		int counter = 1;
		int min = 1;
		int max = 6;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;

		for (counter = 1; counter <= sommersaultRolls; counter++) {
			int randomNum = min + chocoTaco.nextInt(max - min + 1);
			if (randomNum == 1) {
				one++;
			} else {
				if (randomNum == 2) {
					two++;
				} else {
					if (randomNum == 3) {
						three++;
					} else {
						if (randomNum == 4) {
							four++;
						} else {
							if (randomNum == 5) {
								five++;
							} else {
								six++;
							}
						}
					}
				}
			}
		}
		System.out.println("Number of ones: "+one+"\nNumber of twos: "+two+"\nNumber of threes: "+three+"\nNumber of fours: "+four+"\nNumber of fives: "+five+"\nNumber of sixes: "+six);
	}
}
