package kosulluIfadelerveKodBloklari.ucakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Mesafeyi Girin : ");
		int mesafe = scan.nextInt();

		if (mesafe < 0) {
			System.out.println("Hatalı Giriş");
			System.exit(-1);
		}

		System.out.print("Yaşınızı Girin : ");
		int yas = scan.nextInt();

		System.out.print("Tek Yön :1  Gidiş-Dönüş : 2 ");
		int yolculukTipi = scan.nextInt();

		float fiyat = 0;

		if (yas < 12) {
			fiyat = (float) ((mesafe * 0.10) / 0.5);
		} else if (yas >= 12 && yas <= 24) {
			fiyat = (float) ((mesafe * 0.10) / 0.1);
		} else if (yas >= 25 && yas <= 64) {
			fiyat = (float) ((mesafe * 0.10) / 0.1);
		} else if (yas >= 65) {
			fiyat = (float) ((mesafe * 0.10) / 0.3);
		} else {
			System.out.println("Hatalı Giriş");
			System.exit(-1);
		}

		if (yolculukTipi == 2) {
			fiyat = (float) ((fiyat * 2) - (fiyat * 0.20));
		} else if (yolculukTipi != 2 && yolculukTipi != 1) {
			System.out.println("Hatalı Giriş");
			System.exit(-1);
		}

		System.out.println("Toplam Tutar : " + fiyat);

	}

}
