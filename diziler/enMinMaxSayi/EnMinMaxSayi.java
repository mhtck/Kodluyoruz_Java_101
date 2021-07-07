package diziler.enMinMaxSayi;

import java.util.Scanner;

public class EnMinMaxSayi {

	public static void main(String[] args) {
		int[] list = {6, -22, 34, 56, 8, 101, -2, 1 ,10};

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı gir : ");
		int sayi = scan.nextInt();

		int min = list[0];
		int max = list[0];

		for (int i : list) {
			if (i < sayi && (i > min || min > sayi)) {

				min = i;

			}
			if (i > sayi && (i < max || max < sayi)) {

				max = i;

			}
		}

		System.out.println("Minimum Değer " + min + "  Sayınız : " + sayi + "   Maximum Sayi : " + max);

	}
}
