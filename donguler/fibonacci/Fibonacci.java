package donguler.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Fibonacci Serisi Limiti Gir : ");
		
		int seri = scan.nextInt();
		
		int i = 1, j = 1, tmp = 0, current = 0;
		while(i <= seri) {
			
			current = tmp;
			tmp += j;
			System.out.print(tmp + " " );
			j = current;
			i++;
		}
		
		
		
	}

}
