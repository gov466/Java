//java program based on constructors
class Machine {
    private String name;
    private int code;
     
    public Machine() { { //constructr is  spceaial methof that runs everytiemwhen you creatre and instace of your class
//constryct r  no return type name sam eof class
        //name= "Arnie"; 
        this("Arnie", 0);
         
        System.out.println("Constructor running!");
    }
     
    public Machine(String name) {
        this(name, 0);
         
        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other constructor above.
        //this.name = name;
    }
     
    public Machine(String name, int code) {
         
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}
 
public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine(); //object creation
 
        Machine machine2 = new Machine("Bertie");
         
        Machine machine3 = new Machine("Chalky", 7);
    }
    
 
}

    
NOTES:
    The first machine1 will call first method when the control go insiude first method the "this"menthod will go to 
        third method and third construction will output as 1st. and then the output of first method will go as output.
        Then after that 2nf and 3rd mrthod will will be called and processed.
    
