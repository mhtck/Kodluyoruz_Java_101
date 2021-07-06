package metotlar.asalSayi;

import java.util.Scanner;

public class AsalSayi {
	static boolean asal(int sayi, int i){
		if(i == sayi && sayi != 1  ){
			return true;
		}else if(sayi % i != 0 ){
			return asal(sayi, ++i);
		}else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Sayı girin : ");
		int sayi = scan.nextInt();
		if(asal(sayi, 2)) {
			System.out.println(sayi +" Asal Sayıdır :)");
		}else {
			System.out.println(sayi +" Asal Sayı Değildir :(");
		}

	}

}
