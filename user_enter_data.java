import java.util.scanner;
public class Main
{
	public static void main(String[] args) {
	   //create scanner object
	    Scanner input= new Scanner(System.in);
	    System.out.println("Enter line of text"); //output the prompt
	    String line=input.nextLine();       //wait for user to enter the data
	     System.out.println("You entered is" +line);    //display the user entered data
	    
	}
}
