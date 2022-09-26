
public class stringsDemo {
	public static void main(String[] args) {
		String mesaj = "Özge Java Öğreniyor.	";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("8. eleman : " + mesaj.charAt(9));
		System.out.println(mesaj.concat(" Sonunda!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("m"));
		char[] karakterler = new char[9];
		mesaj.getChars(0, 9, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("Ö"));
		System.out.println(mesaj.lastIndexOf("a"));

		String yeniMesaj = (mesaj.replace(' ', '/'));
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(5, 9));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	}
}
