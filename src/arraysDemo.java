
public class arraysDemo {
	public static void main(String[] args) {
		String[] ogrenciler = new String[5];
		ogrenciler[0] = "Kumsal";
		ogrenciler[1] = "Özge";
		ogrenciler[2] = "Mehmet";
		ogrenciler[3] = "Can";
		ogrenciler[4] = "Fulya";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);

		}

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}
