package metotlar.usAlma;

import java.util.Scanner;

public class UsAlma {

	static int us(int taban, int usDeger) {
		if(usDeger == 1){
			return taban;
		}else{
			return taban * us( taban, usDeger - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Taban girin : ");
		int taban = scan.nextInt();

		System.out.print("Us degeri girin : ");
		int usDeger = scan.nextInt();

		System.out.println("Sonuç : " + us(taban, usDeger));



	}

}
