package kosulluIfadelerveKodBloklari.sayilariKucuktenBuyukgeSirala;

import java.util.Scanner;

public class SayilariSirala {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayı giriniz : ");
		int sayi_1 = scan.nextInt();

		System.out.print("İkinci sayı giriniz : ");
		int sayi_2 = scan.nextInt();

		System.out.print("Üçüncü sayı giriniz : ");
		int sayi_3 = scan.nextInt();

		if ((sayi_1 > sayi_2) && (sayi_2 > sayi_3)) {
			System.out.println("sayi_1  >  sayi_2  >  sayi_3");
		} else if ((sayi_2 > sayi_1) && (sayi_1 > sayi_3)) {
			System.out.println("sayi_2  >  sayi_1  >  sayi_3");
		} else if ((sayi_2 > sayi_3) && (sayi_3 > sayi_1)) {
			System.out.println("sayi_2  >  sayi_3  >  sayi_1");
		} else if ((sayi_3 > sayi_2) && (sayi_2 > sayi_1)) {
			System.out.println("sayi_3  >  sayi_2  >  sayi_1");
		}

	}

}
