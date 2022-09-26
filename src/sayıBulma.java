
public class sayıBulma {
	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 3, 6, 8, 9, 0 };
		int aranacak = 9;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMı = true;
				break;
			}
		}
		if (varMı) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}
	}
}
