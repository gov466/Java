import java.util.Scanner;

public class prin_str {
	
	String abs="Govind";
	int a=3,b=4,c=5;
	public void abs() { //method
		String abs= "Govind Raj";
		System.out.println("Printing string via method: "+abs); 
	}
	public void sum() {
		int sum= a+b+c;
		System.out.println("Sum via method: "+sum);
	}
	public static void main(String args[]) {
		
		prin_str str= new prin_str();
		
		Scanner sc = new Scanner(System.in); //object for console input
		System.out.println("Enter a string: "); 
		String name= sc.nextLine(); //console input
		System.out.println("String entered via console is: "+name); //printing string entered via console
		System.out.println("My name is: "+str.abs); //printing from variables
		str.abs(); //printing string from method
		System.out.println("Sum of A+B+C: "+((str.a)+(str.b)+(str.c))); //printing sum from variable input
		str.sum(); //priting sum from method
	}
}
