package kosulluIfadelerveKodBloklari.burcBulma;

import java.util.Scanner;

/**
 * Burç Bulan Program
 * 
 * Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.
 * 
 * Koç Burcu : 21 Mart - 20 Nisan
 * 
 * Boğa Burcu : 21 Nisan - 21 Mayıs
 * 
 * İkizler Burcu : 22 Mayıs - 22 Haziran
 * 
 * Yengeç Burcu : 23 Haziran - 22 Temmuz
 * 
 * Aslan Burcu : 23 Temmuz - 22 Ağustos
 * 
 * Başak Burcu : 23 Ağustos - 22 Eylül
 * 
 * Terazi Burcu : 23 Eylül - 22 Ekim
 * 
 * Akrep Burcu : 23 Ekim - 21 Kasım
 * 
 * Yay Burcu : 22 Kasım - 21 Aralık
 * 
 * Oğlak Burcu : 22 Aralık - 21 Ocak
 * 
 * Kova Burcu : 22 Ocak - 19 Şubat
 * 
 * Balık Burcu : 20 Şubat - 20 Mart
 */

public class BurcBulma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Doğduğunuz ay : ");
		int ay = scan.nextInt();

		System.out.print("Doğduğunuz gün : ");
		int gun = scan.nextInt();

		if (ay == 1) {

			if (gun >= 1 && gun <= 21) {
				System.out.println("Oğlak");
			} else if (gun >= 22 && gun <= 31) {
				System.out.println("Kova");
			}
		}else if (ay == 2) {

			if (gun >= 1 && gun <= 19) {
				System.out.println("Kova");
			} else if (gun >= 20 && gun <= 29) {
				System.out.println("Balık");
			}
		}else if (ay == 3) {

			if (gun >= 1 && gun <= 20) {
				System.out.println("Balık");
			} else if (gun >= 21 && gun <= 31) {
				System.out.println("Koç");
			}
		}else if (ay == 4) {

			if (gun >= 1 && gun <= 20) {
				System.out.println("Koç");
			} else if (gun >= 21 && gun <= 30) {
				System.out.println("Boğa");
			}
		}else if (ay == 5) {

			if (gun >= 1 && gun <= 21) {
				System.out.println("Boğa");
			} else if (gun >= 22 && gun <= 31) {
				System.out.println("İkizler");
			}
		}else if (ay == 6) {

			if (gun >= 1 && gun <= 22) {
				System.out.println("İkizler");
			} else if (gun >= 23 && gun <= 30) {
				System.out.println("Yengeç");
			}
		}else if (ay == 7) {

			if (gun >= 1 && gun <= 22) {
				System.out.println("Yengeç");
			} else if (gun >= 23 && gun <= 31) {
				System.out.println("Aslan");
			}
		}else if (ay == 8) {

			if (gun >= 1 && gun <= 22) {
				System.out.println("Aslan");
			} else if (gun >= 23 && gun <= 31) {
				System.out.println("Başak");
			}
		}else if (ay == 9) {

			if (gun >= 1 && gun <= 22) {
				System.out.println("Başak");
			} else if (gun >= 23 && gun <= 30) {
				System.out.println("Terazi");
			}
		}else if (ay == 10) {

			if (gun >= 1 && gun <= 22) {
				System.out.println("terazi");
			} else if (gun >= 23 && gun <= 31) {
				System.out.println("Akrep");
			}
		}else if (ay == 11) {

			if (gun >= 1 && gun <= 21) {
				System.out.println("Akrep");
			} else if (gun >= 22 && gun <= 30) {
				System.out.println("Yay");
			}
		}else if (ay == 12) {

			if (gun >= 1 && gun <= 21) {
				System.out.println("Yay");
			} else if (gun >= 22 && gun <= 31) {
				System.out.println("Oğlak");
			}
		}

	}

}
