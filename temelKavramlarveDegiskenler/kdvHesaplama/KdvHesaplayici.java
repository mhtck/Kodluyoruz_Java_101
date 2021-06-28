package temelKavramlarveDegiskenler.kdvHesaplama;
import java.util.Scanner;

public class KdvHesaplayici {

	public static void main(String[] args) {
		
		double tutar, kdvOran = 0, kdvTutar = 0, kdvliTutar = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Tutarı Giriniz : ");
		tutar = scan.nextDouble();
		
		
		if(tutar < 1000) {
			kdvOran = 0.18;
			kdvTutar = tutar * kdvOran;
			kdvliTutar = tutar + kdvTutar;	
		}else if(tutar >= 1000) {
			kdvOran = 0.08;
			kdvTutar = tutar * kdvOran;
			kdvliTutar = tutar + kdvTutar;
		}
		
		
		
		System.out.println("Tutar :" + tutar);
		System.out.println("Kdv Oranı : " + kdvOran);
		System.out.println("Kdv Tutarı : " + kdvTutar);
		System.out.println("Kdv'li Tutar :" + kdvliTutar);
		

	}

}
