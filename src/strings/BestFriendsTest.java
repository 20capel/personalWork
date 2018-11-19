package strings;
import java.util.Scanner;
public class BestFriendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BestFriends squidward=new BestFriends();
Scanner slimshady=new Scanner(System.in);
System.out.println("Enter one of your best friend's name and then their ranking");
String name=slimshady.nextLine();
int ranking=slimshady.nextInt();
System.out.println(squidward.changeFriend(name, ranking));
String bestFriend1=squidward.getFriend1();
System.out.println(bestFriend1.charAt(0));
System.out.println(squidward.getLastLength3());
	}

}
