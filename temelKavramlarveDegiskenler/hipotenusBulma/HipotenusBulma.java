package temelKavramlarveDegiskenler.hipotenusBulma;

import java.util.Scanner;

public class HipotenusBulma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, c;
		System.out.println("-----Üçgenin kenarlarını giriniz-----");

		System.out.printf("Birinci kenar : ");
		a = scan.nextInt();
		
		System.out.printf("İkinci kenar : ");
		b = scan.nextInt();
		
		System.out.printf("Üçüncü kenar : ");
		c = scan.nextInt();
		
		int u = (int)(a + b+ c) / 2;
		
		int alan = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));//Math.sqrt() metodu degerin lükünü hesaplıyor
		
		System.out.println("Alan : " + alan);
	}

}
