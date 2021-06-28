package kosulluIfadelerveKodBloklari.hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Birinci Sayı Gir : ");
		int sayi_1 = scan.nextInt();
		System.out.print("ikinci Sayı Gir : ");
		int sayi_2 = scan.nextInt();
		System.out.println("\n================== İşlem Seciniz ==================");
		System.out.println("Toplama 1\nÇıkarma 2\nÇarpma 3\nBölme 4\n");
		int secim = scan.nextInt();
		System.out.println("===================================================");
		
		switch(secim) {
			
		case 1:{
			System.out.println("Sayıların Toplamı = " + (sayi_1 + sayi_2));
			break;
		}
		case 2:{
			System.out.println("Sayıların Çıkarımı = " + (sayi_1 - sayi_2));
			break;
		}
		case 3:{
			System.out.println("Sayıların Çarpımı = " + (sayi_1 * sayi_2));
			break;
		}
		case 4:{
			System.out.println("Sayıların Bölümü = " + (sayi_1 / sayi_2));
			break;
		}
		default:
			System.out.println("Yalnış Tuşlama !!! ");
		
		}
		

	}

}
