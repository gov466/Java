
public class Calculator { //to change the class name right click and choose refractor
	int num1 = 10;
	int num2 = 3;
	
	public void add() {
		int sum = num1+num2;
		System.out.println(sum);
	}
	public void  sub() {
		int sub = num1-num2;
		System.out.println(sub);
	}
	
	public static void main(String args[]) {
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		/*int num1=6;
		int num2=7;
		
		int total = num1+num2;
		int sub = num2-num1;
		System.out.println(total);
		System.out.println(sub);*/

		
	}
			
}
