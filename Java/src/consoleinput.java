import java.util.Scanner;

public class consoleinput {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); //scanner object creation
	//system .in means input will come from console
	//string input
	String name = sc.nextLine();
	System.out.println("Name is "+name);
	}
}
