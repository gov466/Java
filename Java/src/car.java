
public class car {
//methods attributes
	//these variables can be used anywhere
	//variables declared isndie method is only used inside method
	int Topspeed = 120;  //global variable //variable declared inside class called as instance variable
    float enginecap= (float)99.99;
    String color = "green";
    char c= 'b';
	//method break
    public void brake() {
    	System.out.println("ABS");
    	
    }
  //method engine
    public void engine() {
    	
    	System.out.println("diesel");
    }
    
    public void carbody() {
    	System.out.println(color);
    }
    //to execute the program JVM will come to this line
    //static is memmory location
    //public=access modifier
    public static void main(String args[]) {
    	car cr = new car(); //object creation
    	System.out.println("top speed of car is :"+cr.Topspeed);
    	System.out.println("top speed of car is :"+cr.color);
    	cr.brake(); //calling method brake
    	cr.engine();
    	cr.carbody();
    	/*
    	System.out.print("qa test");
    	//primtln moves the cursur to next line but print the statement in same line as above print
    	System.out.println("automation");
    	System.out.print("qa test");
    	 */

    }
}

/*OOPs- inheritence  -
 * poly
 * abstrction
 * encaps
*/
