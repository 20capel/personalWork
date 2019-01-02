package strings;
import java.util.Scanner;

public class PlaygroundResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int[][]heights=new int[3][4];
double aveHeight=0;
int tallestStudent=0;
int shortestStudent=100000;
int numStudents=0;
for(int i=0; i<heights.length;i++){
	for(int j=0;j<heights[0].length;j++){
	System.out.println("Enter the height of the student in inches");
	int studentHeight=input.nextInt();
	heights[i][j]=studentHeight;
}}
for(int i=0;i<heights.length;i++){
	for(int j=0;j<heights[0].length;j++){
		aveHeight=aveHeight+heights[i][j];
		if(heights[i][j]>tallestStudent){
			tallestStudent=heights[i][j];
		}
		if(heights[i][j]<shortestStudent&&heights[i][j]!=0){
			shortestStudent=heights[i][j];
		}
		if(heights[i][j]!=0){
		numStudents++;
		}
	}
}
aveHeight=aveHeight/(double)numStudents;
int zeroHole=12-numStudents;
System.out.println("Tallest student: "+tallestStudent);
System.out.println("Shortest student: "+shortestStudent);
System.out.println(aveHeight);
	}

}
