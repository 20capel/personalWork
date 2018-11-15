package strings;

public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Essay markus=new Essay();
markus.setName("slimshady master");
System.out.println(markus.returnLastName());
System.out.println(markus.returnCharacters());
System.out.println("Does your name contain X? "+markus.trueFalse());
markus.setText("I'm the slim shady yes I'm the real shady all you other slim shadys are just imitating");
System.out.println(markus.returnWords());
	}

}
