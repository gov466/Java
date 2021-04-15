
//inheritence
public class bmw extends car{
	//mrthof overriding//run time polumorphism
	public void engine() {
		System.out.println("Type of engien is Electric");
	}

	 public static void main(String args[]) {
		 
		 bmw b = new bmw();
		 System.out.println(b.color); //child class accessing parent
		 System.out.println(b.Topspeed); //gloabl vairbles
		 b.brake(); //accessing method
		 b.engine();
		 
		 
		 
	 }
	
}
