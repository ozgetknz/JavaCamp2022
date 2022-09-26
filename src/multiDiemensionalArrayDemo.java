
public class multiDiemensionalArrayDemo {
	public static void main(String[] args) {
		String[][] sehirler = new String[4][4];
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[0][3] = "Edirne";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[1][3] = "Eskişehir";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		sehirler[2][3] = "Mardin";
		sehirler[3][0] = "Adana";
		sehirler[3][1] = "Mersin";
		sehirler[3][2] = "Antalya";
		sehirler[3][3] = "Hatay";

		for (int i = 0; i <= 3; i++) {
			System.out.println("--------------------");
			for (int ö = 0; ö <= 3; ö++) {
				System.out.println(sehirler[i][ö]);
			}
		}

	}
}
