package donguler.ebobEkok;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Birinci Sayı : ");
		int s1 = scan.nextInt();

		System.out.print("İkinci Sayı : ");
		int s2 = scan.nextInt();

		System.out.println(s1 + " ve " + s2 + " Ebobu ");

		int i = 1;
		int ebob = 0;
		while (i <= s1 && i <= s2) {
			if (s1 % i == 0 && s2 % i == 0) {
				ebob = i;
				System.out.print(ebob + ", ");
				i++;
			} else {
				i++;
			}

		}
		System.out.println("\nEBOB : " + ebob);

		System.out.println(s1 + " " + s2 + " EKOK :" + (s1 * s2) / ebob);

	}

}
