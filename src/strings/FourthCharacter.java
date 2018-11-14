package strings;

import java.util.Scanner;

public class FourthCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner slimshady = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = slimshady.nextLine();
		int index = 0;
		for (int counter = 0; counter < sentence.length(); counter = counter + 4) {
			System.out.println(sentence.charAt(counter));
		}

	}

}
