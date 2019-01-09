package strings;
import java.util.ArrayList;
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Animal>pets=new ArrayList<Animal>();
pets.add(new Dog());
pets.add(new Dog());
pets.add(new Dog());
pets.add(new Cat());
pets.add(new Cat());
pets.add(new Cat());
for(Animal dug: pets ) {
	dug.act();
	System.out.println(dug.toString());
}
	}

}
