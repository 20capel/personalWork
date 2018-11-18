package strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lilsanta = new Scanner(System.in);
		System.out.println("Enter a sentence with a period");
		String sentence = lilsanta.nextLine();
		int counter = 0;
		int index = 0;

		int numOfWords = 1;
		do {
			counter=0;
			index=0;
			numOfWords=1;
			for (counter = 0; counter < sentence.length(); counter++) {
				if (sentence.charAt(counter) == ' ' || sentence.charAt(counter) == '.') {
					System.out.println(sentence.substring(index, counter));
					index = counter + 1;
				}
				if (sentence.charAt(counter) == ' ') {
					numOfWords++;
				}
			}
			System.out.println("There are " + numOfWords + " words");
			System.out.println("Enter a sentence with period (999 to quit)");
			sentence = lilsanta.nextLine();
		} while (sentence != "999");

	}
}
