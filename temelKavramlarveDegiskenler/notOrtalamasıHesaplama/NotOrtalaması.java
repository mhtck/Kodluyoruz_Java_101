package temelKavramlarveDegiskenler.notOrtalamasıHesaplama;

import java.util.Scanner;

public class NotOrtalaması {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int matematik, fizik, kimya, geometri, tarih;
		
		System.out.print("Matemetik Notu : ");
		matematik = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Fizik Notu : ");
		fizik = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Kimya Notu : ");
		kimya = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Geometri Notu : ");
		geometri = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Tarih Notu : ");
		tarih = scan.nextInt();
		
		System.out.println();
		
		double ortalama ;
		
		ortalama = (double) (matematik + fizik + geometri + kimya + tarih) / 5;
		
		String durum =  ortalama > 59 ? "Geçtiniz" : "Canın Sagulsun Kardaş";
		
		System.out.println(durum);
		
		

	}

}
