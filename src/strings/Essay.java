package strings;

public class Essay {
	private String name;
	private String text;

	public Essay() {
		name = "Leah Cape";
		text = "Here is the essay I have made for you.";
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setText(String newText) {
		text = newText;
	}

	public String returnLastName() {
		int index = name.indexOf(" ");
		index = index + 1;
		int lastLetter = name.length();
		lastLetter = lastLetter;
		String lastName = name.substring(index, lastLetter);
		return lastName.toUpperCase();
	}

	public int returnCharacters() {
		int index = name.indexOf(" ");
		return index;
	}

	public boolean trueFalse() {
		boolean trueFalse = name.contains("X");
		return trueFalse;
	}

	public int returnWords() {
		int counter = 0;
		int words = 0;
		for (counter = 0; counter < text.length(); counter++) {
			char character = text.charAt(counter);
			if (character == ' ') {
				words++;
			}
		}
		words=words+1;
		return words;
	}

}