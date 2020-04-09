//another class called machine
public class Machine {
     
    protected String name = "Machine Type 1"; //string name is of type protected so can be accessed anywhere from package or child class
     
    public void start() {          //method
        System.out.println("Machine started.");
    }
     
    public void stop() {      //another methjod
        System.out.println("Machine stopped.");
    }
}
