//java program demonstrates static and final keyworkds in java
class Thing {
    public final static int LUCKY_NUMBER = 7;
     
    public String name;                     //normal declaration
    public static String description;       //static declaration which no need object inside main
     
    public static int count = 0;
     
    public int id;
     
    public Thing() {
         
        id = count;
         
        count++;
    }
     
    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }
     
    public static void showInfo() {
        System.out.println(description); 
        // Won't work: System.out.println(name);
    }
}
 
 
public class App {
 
    public static void main(String[] args) {
         
        Thing.description = "I am a thing"; //description is a static string so it can be accessed directly and given its value
         
        Thing.showInfo();   //will call the showinfo method which is of type void that prints the description there itself
         
        System.out.println("Before creating objects, count is: " + Thing.count); //this statement tells the no of obejct created
         
        Thing thing1 = new Thing(); //two objects being created
        Thing thing2 = new Thing();
         
        System.out.println("After creating objects, count is: " + Thing.count); //count valjue after object creation
         
        thing1.name = "Bob";
        thing2.name = "Sue";
         
        thing1.showName();
        thing2.showName();
         
        System.out.println(Math.PI);
         
        System.out.println(Thing.LUCKY_NUMBER);
    }
 
}
