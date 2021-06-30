package donguler.kombinasyon;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n girin : ");
		int n = scan.nextInt();
		
		System.out.print("r girin : ");
		int r = scan.nextInt();
		
		int nf = 1, rf = 1, nrf = 1;
		
		for(int i = 1 ; i <= n ; i++ ) {
			nf = nf * i;
		}
		
		for(int i = 1 ; i <= r ; i++ ) {
			rf  *= i;
		}
		
		for(int i = 1 ; i <= (n - r) ; i++ ) {
			nrf  *= i;
		}
		
		int kombinasyon = nf / (rf * nrf);
		
		System.out.println("C("+ n + ","+ r +") = "+ kombinasyon);
		

	}

}
