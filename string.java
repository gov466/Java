//program to print a string in java in two different ways
public class Main
{
	public static void main(String[] args) {
	    String text="govind"; //first string
	    String blank=" "; //blank space
	    String last ="Raj"; //second string
	    String name=text+blank+last;
		System.out.println(name);   //one way
		System.out.println("govind"+" " +"Raj");  //other way
	}
}
