package strings;

public class BestFriends {
	private String name1;
	private String name2;
	private String name3;

	public BestFriends() {
		name1 = "Bob Smith";
		name2 = "Judy Jones";
		name3 = "Billy Miller";
	}

	public Boolean changeFriend(String newName, int ranking) {
		if (ranking == 1) {
			name1 = newName;
		} else {
			if (ranking == 2) {
				name2 = newName;
			} else {
				name3 = newName;
			}
		}
		if (newName.contains(" ") == true) {
			return true;
		} else {
			return false;
		}
	}

	public String getFriend1() {
		return name1;
	}

	public int getLastLength3() {
		String newName3 = name3.substring(name3.charAt(' ') + 1, name3.length());
		return newName3.length();
	}

}
