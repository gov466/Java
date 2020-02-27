//Prpogram that returns value to main
class Person {
    String name;          //data
    int age;
     
    void speak() {          //methods
        System.out.println("My name is: " + name);
    }
     
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
         
        return yearsLeft;
    }
     
    int getAge() {      //The age value is returned  to main again
        return age;
    }
     
    String getName() {
        return name;
    }
}
 
 
public class App {
 
    public static void main(String[] args) {
        Person person1 = new Person();        //declare Object to call data in class  
         
        person1.name = "Joe";       // inputing name as joe
        person1.age = 25;
         
        person1.speak();
         
        int years = person1.calculateYearsToRetirement(); //calling a member function of class
         
        System.out.println("Years till retirements " + years);
         
        int age = person1.getAge();
        String name = person1.getName();
         
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
 
}
