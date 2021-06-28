package temelKavramlarveDegiskenler.vucutKitleIndeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Boyunuzu (metre cinsinde) girin : ");
		float boy = scan.nextFloat();
		System.out.print("Kilonuzu girin : " );
		float kilo = scan.nextFloat();
		
		double vucutIndeks = kilo / Math.pow(boy, 2);
		System.out.println("Vücut İndeksiniz : " + vucutIndeks);

	}

}
