
public class loopDemo {
	public static void main(String[] args) {

		for (int i = 5; i <= 25; i += 5) {
			System.out.println(i);
		}
		System.out.println("For için döngü bitti.");

		int i = 3;
		while (i < 14) {
			System.out.println(i);
			i += 3;
		}

		System.out.println("while için döngü bitti.");

		int ö = 150;
		do {
			System.out.println(ö);
			ö += 4;
		} while (ö < 20);
		System.out.println("Do-while için döngü bitti.");

	}

}
