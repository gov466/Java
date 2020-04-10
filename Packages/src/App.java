import ocean.Fish;     //fish is a class used here but it resides within a package called ocean so importing from ocean
import ocean.plants.Seaweed; //seaweed is class imported from package plants which resides as subpackage of ocean
 
public class App {
 
     
    public static void main(String[] args) {
        Fish fish = new Fish(); //call two classes
        Seaweed weed = new Seaweed();
    }
 
}
