
public class sesliHarfler {
	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'O':
		case 'U':
		case 'A':
		case 'I':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}

	}
}
