
public class compareS {
	
	
	 public static void main(String args[]) {
		 
		 String a ="xyz";
		 String b ="xyz";
		 String c ="rtyz";
		 String d ="Rtyz";
		 String e ="how are you";
		 String f ="how";
		 
		 if (a.equals(b)) //is case sensitive
		 {
			 System.out.println("equal strings"); 
		 }
		 else
		 {
			 System.out.println("Not equal");
		 }
		 
		 if(c.equalsIgnoreCase(d)) {
			 System.out.println("match found");
		 }
		 if(e.contains(f)) {
			 System.out.println("common elemnts found");
		 }
		 else {
			 System.out.println("not found");
		 }
	 }

}
