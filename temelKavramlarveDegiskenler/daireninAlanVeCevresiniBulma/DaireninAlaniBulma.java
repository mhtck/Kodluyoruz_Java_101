
package temelKavramlarveDegiskenler.daireninAlanVeCevresiniBulma;

import java.util.Scanner;

public class DaireninAlaniBulma {

	public static void main(String[] args) {

		float PI = 3.14f;
		Scanner scan = new Scanner(System.in);
		int cap;
		System.out.print("Dairenin Çapını Girin : ");
		cap = scan.nextInt();

		float alan = (float) (PI * Math.pow(cap, 2));
		float cevre = 2 * PI * cap;

		System.out.printf("Dairenin alanı '%.4f' cevresi : '%.4f'", alan, cevre);

		System.out.print("\n\nDaire dilimi alanı hesaplamak için açı girin :");
		int aci = scan.nextInt(); // Dilim açısı
		float dilimAlan = (float) ((PI * (Math.pow(cap, 2)) * aci) / 360);

		System.out.printf("Daire diliminin alanı : %.4f", dilimAlan);

	}

}
