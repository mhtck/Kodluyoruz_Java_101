package donguler.usluSayiHesaplama;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayi girin : ");
		int sayi = scan.nextInt();
		
		System.out.print("Sayi üssünü girin : ");
		int ussu = scan.nextInt();
		
		int result = 1;
		for (int i = 0; i < ussu; i++) {
			result *= sayi; 
		}
		
		System.out.println(sayi +" sayisinin üssü = " + result);

	}

}
