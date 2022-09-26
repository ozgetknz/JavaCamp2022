
public class miniProjeAsalSayı {
	public static void main(String[] args) {
		int number = 33;
		int sayac = 0;
		if (number == 1) {
			System.out.println("Girdiğiniz sayı asal değildir");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				sayac++;
		}

		if (sayac != 0)
			System.out.println("Girdiğiniz sayi asal değildir");
		else
			System.out.println("Girdiğiniz sayı asaldır.");

	}
}
