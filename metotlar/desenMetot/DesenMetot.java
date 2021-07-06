package metotlar.desenMetot;

import java.util.Scanner;

public class DesenMetot {
	
	static int desen1(int sayi) {
		if(sayi > 0) {
			System.out.print(sayi + " ");
			return desen1(sayi - 5);
		}
		return sayi;
	}
	static String desen2(int i , int sayi) {
		if(i < sayi) {
			System.out.print(i + " ");
			return desen2(i + 5, sayi);
		}
		System.out.print(i);
		return "";
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayı girin : ");
		int sayi = scan.nextInt();
		
		desen2(desen1(sayi),sayi);
		
		
	}

}
