package temelKavramlarveDegiskenler.manavKasaProgrami;

import java.util.Scanner;

public class manavKasa {

	public static void main(String[] args) {
		
		float armutKG , elmaKG , domatesKG , muzKG , patlicanKG ;
		
		float armutFT = 2.14f, elmaFT = 3.67f, domatesFT = 1.11f, muzFT = 0.95f, patlicanFT = 5.00f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Armut kaç kilo : ");
		armutKG = scan.nextFloat();
		
		System.out.print("\nElma kaç kilo : ");
		elmaKG = scan.nextFloat();
		
		System.out.print("\nDomates kaç kilo : ");
		domatesKG = scan.nextFloat();
		
		System.out.print("\nMuz kaç kilo : ");
		muzKG = scan.nextFloat();
		
		System.out.print("\nPatlıcan kaç kilo : ");
		patlicanKG = scan.nextFloat();
		
		float tutar = (armutFT * armutKG) + (elmaKG * elmaFT) + (domatesKG * domatesFT) + (muzKG * muzFT) + (patlicanKG * patlicanFT);
		
		System.out.println("\nTOPLAM TUTAR : " + tutar);

	}

}
