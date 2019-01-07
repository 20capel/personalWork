package strings;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Person>school=new ArrayList<Person>();
Scanner input=new Scanner(System.in);
Teacher bob=new Teacher();
Person bobbi=new Teacher();
System.out.println(bobbi.getName());
System.out.println(bobbi.getAge());
StudentClass tod=new StudentClass();
Person todd=new StudentClass();
System.out.println(todd.getAge());
System.out.println(todd.getName());
school.add(bob);
school.add(bobbi);
for(Person i:school){
	if(i instanceof Student){
		StudentClass bub=(StudentClass)i;
		bub.outSick();
	}
	System.out.println(i.getName());
}

	}

}
