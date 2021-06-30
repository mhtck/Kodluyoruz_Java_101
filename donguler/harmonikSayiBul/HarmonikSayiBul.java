package donguler.harmonikSayiBul;

import java.util.Scanner;

public class HarmonikSayiBul {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz :");
        int n = scan.nextInt();
        
        int i = 1;
        double result = 0;
        while(i <= n) {
        	result += (double)1 / i;
        	i++;
        }
		System.out.println("Seri toplamı : " + result);
		
		
	}

}
