
public class car {
//methods attributes
	//these variables can be used anywhere
	//variables declared isndie method is only used inside method
	int Topspeed = 120;  //global variable //variable declared inside class called as instance variable
    float enginecap= (float)99.99;
    static String color = "green";
    char c= 'b';
    boolean flag =  false; //eitther takes true or false
	//method break
    public void brake() {
    	System.out.println("ABS");
    	
    }
  //method engine
    public void engine() {
    	
    	System.out.println("Type of engine petrol ");
    }
    //method overloading
    public void engine(int capacity) {
    	System.out.println("engine capacity is"+capacity );
 
    }
    public void engine(String material) {
    	System.out.println("engine capacity is"+material );
    }
    public void engine(String material, String b) {
    	System.out.println("engine capacity is"+material );
    }
    
    public void carbody() {
    	System.out.println(color);
    }
    //to execute the program JVM will come to this line
    //static is memmory location
    //public=access modifier
    public static void main(String args[]) { //statis is for memmory location
    	car cr = new car(); //object creation
    	System.out.println("top speed of car is :"+cr.Topspeed);
    	System.out.println("top speed of car is :"+cr.color);
    	cr.brake(); //calling method brake
    	cr.engine();
    	cr.engine(150);
    	cr.engine("steel");
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
