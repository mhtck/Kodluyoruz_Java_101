package donguler.minMaxSayi;

import java.util.Scanner;

public class MinMaxSayi {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int min = 0, max = 0;
		String secim;
		
		while(true) {
			System.out.print("Sayı Gir (Bitirme için q gir) : ");
			secim = scan.next();
			
			if(!secim.equals("q")) {
				int tmp = Integer.parseInt(secim);
				if(tmp < min || min == 0)
					min = tmp;
				if(tmp > max)
					max = tmp;
			}else
				break;
		}
		
		System.out.println("Min : " + min + " Max : " + max);

	}

}
