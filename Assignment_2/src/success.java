import java.util.Scanner;

public class success {
	
	public static void main(String args[]) {
		System.out.println("Enter string 1: ");
		Scanner input1= new Scanner(System.in);
		String string1 = input1.nextLine();
		System.out.println("Enter string 2: ");
		Scanner input2= new Scanner(System.in);
		String string2 = input2.nextLine();
		//String string1="Qa testing using java";
		//String string2="java";
		if( string1.contains(string2)) { //compare two variables
			   System.out.println("success");
		   }
		   else {
			   System.out.println("failure");
		   }
		
	}

}
