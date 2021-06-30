package donguler.basamakSayilarinToplamai;

import java.util.Scanner;

public class BasamakToplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayi Giriniz : ");
		int sayi = scan.nextInt();

		int basamak = 1;
		for (int j = 10; j <= sayi; j *= 10) {
			basamak++;
		}

		int result = 0;
		int temp = 0;
		for (int i = 1 , j = 10; i <= basamak; i++, j *= 10) {
			if(i == 1) {
				temp = (sayi % j) ;
				result += temp;
				System.out.print(temp + " + ");
			}else {
				temp = (int) (((sayi % j) - (sayi % (Math.pow(10, i-1)))) / (Math.pow(10, i-1))) ;//*** Yıldızlı Formül
				result += temp;
				System.out.print(temp + " + ");
			}
			
			
		}
		System.out.println("\nToplam : " + result);

	}

}
