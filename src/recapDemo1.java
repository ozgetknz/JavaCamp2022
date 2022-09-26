
public class recapDemo1 {
	public static void main(String[] args) {
		int sayi1 = 67;
		int sayi2 = 35;
		int sayi3 = 188;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En büyük = " + enBuyuk);

	}
}
