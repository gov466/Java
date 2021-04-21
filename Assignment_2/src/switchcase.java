import java.util.Scanner;

public class switchcase {
	public static void main(String args[]) {
		// int a= 10;
		for (;;) {
			System.out.println("Enter the mark: ");
			Scanner mark = new Scanner(System.in);
			int grade = mark.nextInt(); // scanner to take integer input

			switch (grade) {
			case 80:
				System.out.println("Grade A");
				break;
			case 70:
				System.out.println("Grade B");
				break;
			case 60:
				System.out.println("Grade C");
				break;
			case 50:
				System.out.println("Grade D");
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
}
