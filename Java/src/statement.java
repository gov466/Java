
public class statement {
 public static void main(String args[]) {
		 
	 	int age =20;
	 	int a=10;
	   Boolean result1= true;
	   Boolean result2= false;
	   
	   if(a<12) {
		   result2 = true;
		   if( result1.equals(result2)) { //compare two variables
			   System.out.println("comparing two boolean variables success");
		   }
		   else {
			   System.out.println("failure");
		   }
	   }
	 	if(age<20) {
	 		System.out.println("Teeneger");
	 	}
	 	else if(age>20) {
	 		System.out.println("Not teeneger");
	 	}
	 	else {
	 		System.out.println("Inavlid");
	 	}
	 	
	 }
}
