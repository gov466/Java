
public class duplicate {

	public static void main(String[] args) {
		int a[] = { 3, 3, 4, 5, 7, 4, 8, 9, 9 };
		int b[]= {};
		System.out.println("Duplicate elements are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
