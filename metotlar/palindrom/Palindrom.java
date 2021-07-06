package metotlar.palindrom;


/*
 * Palindrom Sayılar

Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
Palindrom Sayı Nedir ?

Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/
public class Palindrom {

	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, mod;

		while (temp != 0) {
			mod = temp % 10;
			reverseNumber = (reverseNumber * 10) + mod;
			temp /= 10;
		}
		return number == reverseNumber;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrom(369));
	}
}
