
public class boolstatement {

	boolean result;
	
	public boolean check() {
		
		int a =10;
		if(a>9 ) {
			result=false;
		}else {
			result=true;
		}
		return result;
	}
	public static void main(String args[]) {
		
		
		boolstatement s = new boolstatement();
		System.out.println(s.check());	}
}
