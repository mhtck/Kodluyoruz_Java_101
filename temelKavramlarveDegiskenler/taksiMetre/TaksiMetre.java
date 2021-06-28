package temelKavramlarveDegiskenler.taksiMetre;

import java.util.Scanner;

/*
 * 
 * 
 * Taksimetre Programı

    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.

    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.

    Taksimetre açılış ücreti  10 TL'dir.
    
    */

public class TaksiMetre {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float tutar = 10;
		int mesafe;
		
		System.out.print("Mesafeyi Girin : ");
		mesafe = scan.nextInt();
		
		tutar += mesafe * 2.20;
		
		if(tutar < 20) {
			System.out.println("Tutar : " + 20);
		}
		else {
			System.out.println("Tutar : " + tutar);
		}
		
		
		

	}

}
