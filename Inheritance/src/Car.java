//inheritaed class from machine
public class Car extends Machine {
     
     
    @Override
    public void start() {               //methods of child class
        System.out.println("Car started");
    }
 
    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }
     
    public void showInfo() {
        System.out.println("Car name: " + name); //printing the name defined in machine from here
    }
}
