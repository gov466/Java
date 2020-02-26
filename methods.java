class Person {    //declaring class
 
    // Instance variables (data or "state")
    String name;
    int age;
 
    // Classes can contain
 
    // 1. Data
    // 2. Subroutines (methods)
     
    void speak() {               //subroutine1
        for(int i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
     
    void sayHello() {    //subroutine 2
        System.out.println("Hello there!");
    }
}
 
public class methods { //starting main (class name should be same as file name)
 
    public static void main(String[] args) {
 
        // Create a Person object using the Person class
        Person person1 = new Person(); //class obejct1
        person1.name = "Joe Bloggs"; //giving first object name  and age
        person1.age = 37;
        person1.speak();  //calling the subroutine1
        person1.sayHello(); //calling the subroutine1
 
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person1.sayHello();
 
        System.out.println(person1.name); //printsname of 1st person 
 
    }
 
}
