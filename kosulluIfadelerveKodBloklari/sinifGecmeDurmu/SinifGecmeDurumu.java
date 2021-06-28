package kosulluIfadelerveKodBloklari.sinifGecmeDurmu;

import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matematik, fizik, kimya, geometri, tarih;

		System.out.print("Matemetik Notu : ");
		matematik = scan.nextInt();
		if (!(matematik > 0 && matematik <= 100))
			matematik = 0;

		System.out.println();

		System.out.print("Fizik Notu : ");
		fizik = scan.nextInt();
		if (!(fizik > 0 && fizik <= 100))
			fizik = 0;

		System.out.println();

		System.out.print("Kimya Notu : ");
		kimya = scan.nextInt();
		if (!(kimya > 0 && kimya <= 100))
			kimya = 0;

		System.out.println();

		System.out.print("Geometri Notu : ");
		geometri = scan.nextInt();
		if (!(geometri > 0 && geometri <= 100))
			geometri = 0;

		System.out.println();

		System.out.print("Tarih Notu : ");
		tarih = scan.nextInt();
		if (!(tarih > 0 && tarih <= 100))
			tarih = 0;

		System.out.println();

		double ortalama;

		ortalama = (double) (matematik + fizik + geometri + kimya + tarih) / 5;

		if (ortalama >= 55) {
			System.out.println("Geçtiniz" + "Ortalama :" + ortalama);
		} else {
			System.out.println("Ortalama :" + ortalama + " 55 Altında " + "Kaldınız");
		}

	}

}
