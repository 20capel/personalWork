package strings;

public class Story {
	private String story;

	public Story(String newStory) {
		story = newStory;
	}

	public String getStory() {
		return story;
	}

	public int wordCount() {
		int counter = 0;
		int numSpaces = 1;
		for (counter = 0; counter < story.length(); counter++) {
			if (story.charAt(counter) == ' ') {
				numSpaces++;
			}
		}
		return numSpaces;
	}

	public String firstWord() {
		String firstWord = story.substring(0, story.indexOf(" "));
		return firstWord;
	}
	
	
}
