package donguler.sayininKuvvetiniBulma;

import java.util.Scanner;

public class KuvvetBulma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayi Giriniz : ");
		int sayi = scan.nextInt();
		
		for(int i = 0; i < 2; i++) {
			if (i == 0) {
				System.out.println("------- Dortun Katları -------");
				for(int j = 4 ; j < sayi ; j *= 4) {
					System.out.print(j + ", ");
				}
			}else if (i == 1) {
				System.out.println("\n------- Beşin Katları -------");
				for(int j = 5 ; j < sayi ; j *= 5) {
					System.out.print(j + ", ");
				}
			}
		}

	}

}
