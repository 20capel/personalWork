package strings;
import java.util.ArrayList;
public class ArrayListFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Friend> array=new ArrayList<Friend>();
Friend bob=new Friend("bob",2);
array.add(bob);
Friend mark=new Friend("mark",1);
array.add(mark);
Friend peter=new Friend("peter",3);
array.add(peter);
for(int counter=0;counter<array.size();counter++){
	System.out.println(array.get(counter).getAge());
}

	}

}
