package diziler.diziSirala;

import java.util.Scanner;

public class DiziSirala {

	static int[] shorts(int[] dizi) {
		int tmp;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length - 1; j++) {
				if (dizi[j] > dizi[j + 1]) {
					tmp = dizi[j];
					dizi[j] = dizi[j + 1];
					dizi[j + 1] = tmp;
				}
			}
		}
		return dizi;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Dizi Boyutu : ");
		int boyut = scan.nextInt();
		int[] dizi = new int[boyut];

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(i + " . elemanı gir :");
			dizi[i] = scan.nextInt();
		}
		dizi = shorts(dizi);
		for (int i : dizi) {
			System.out.print(i + " ");
		}
	}

}
