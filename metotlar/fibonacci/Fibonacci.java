package metotlar.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	
	static int f(int i) {
		if(i == 1 ||i == 2) {
			return 1;
		}else {
			return f(i-2) + f(i-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("Sayı gir :");
		int sayi = scan.nextInt();
		System.out.println(f(sayi));

	}

}
