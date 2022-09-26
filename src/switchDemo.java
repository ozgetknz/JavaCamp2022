
public class switchDemo {
	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Harika : Geçtiniz");
			break;
		case 'B':
			System.out.println("Tebrikler : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Biraz daha çalışmalısınız : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;
		default:
			System.out.println("Girilen not geçersiz.");
		}

	}
}
