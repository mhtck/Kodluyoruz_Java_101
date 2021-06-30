package donguler.CiftveDortunKati;

import java.util.Scanner;

public class CiftVeDortunKati {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int toplam = 0;
		while(true) {
			System.out.print("Sayi Giriniz : ");
			int sayi = scan.nextInt();
			
			if(sayi % 2 != 0) {
				System.out.println(" Bitti ");
				break;
			}else {
				if(sayi % 2 == 0 && sayi % 4 == 0) {
					toplam += sayi;
				}
			}
		}
		System.out.println("Toplam : " + toplam);

	}

}
