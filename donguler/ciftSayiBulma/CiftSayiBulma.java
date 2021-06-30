package donguler.ciftSayiBulma;

import java.util.Iterator;
import java.util.Scanner;

public class CiftSayiBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayi Giriniz : ");
		int sayi = scan.nextInt();
		
		for (int i = 0; i <= sayi; i++) {
			if(i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		
		
		
	}

}
