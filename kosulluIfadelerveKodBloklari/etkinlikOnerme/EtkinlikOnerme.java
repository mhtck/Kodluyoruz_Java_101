package kosulluIfadelerveKodBloklari.etkinlikOnerme;

import java.util.Scanner;

/*
 * 
 * Hava Sıcaklığına Göre Etkinlik Önerme

Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.

Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Ödev

Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

public class EtkinlikOnerme {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Hava kaç derece : ");
		int derece = scan.nextInt();
		
		if(derece > 25) {
			System.out.println("Hava sıcak yüzmeye gidebilirsin.");
		}
		else if(derece < 25 && derece >= 5) {
			if(derece < 25 && derece >=10 ) {
				System.out.println("Tam piknik havası.");
			}
			if(derece < 15 && derece >= 5) {
				System.out.println("Güzel filim biliyorum. Hadi sinemaya.");
			}
		}
		else {
			System.out.println("Bu havada gidilmez....");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
