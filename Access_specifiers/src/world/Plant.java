package world; //separate package world
 
class Something {
     
}
 
public class Plant {
    // Bad practice
    public String name;
     
    // Accepatable practice --- it's final.
    public final static int ID = 8;
     
    private String type; //access specifier private
     
    protected String size;
     
    int height;
     
    public Plant() {  //constructor
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}
