package donguler.yıldizlaucgen;

import java.util.Scanner;

public class YildizlaUcgen {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Üçgen Basamağı Girin : ");
		int n = scan.nextInt();
		
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i + 1); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
