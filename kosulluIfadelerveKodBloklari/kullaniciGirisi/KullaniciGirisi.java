package kosulluIfadelerveKodBloklari.kullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String passwd = "123";
		System.out.print("Username : ");
		String username = scan.nextLine();

		System.out.print("Password : ");
		String password = scan.nextLine();

		if (username.equals("mhtck") && password.equals(passwd)) {
			System.out.println("~~~  Hoşgeldiniz  ~~~");
		} else {
			if (username.equals("mhtck") && !(password.equals(passwd))) {
				System.out.println("Şifre Sıfırlamak Istiyormusun ?");
				boolean sifirla = scan.nextBoolean();
				if (sifirla) {
					scan.reset();
					while(true) {
						System.out.print("Yeni şifre :");
						String yeniPwd = scan.nextLine();
						if(yeniPwd != passwd && yeniPwd != password && yeniPwd != "") {
							System.out.println("Şifre oluşturuldu : " + yeniPwd);
							break;
						}else {
							System.out.println("Başka şifre deneyin !!!");
						}
						
					}
				}

			}
		}

	}

}
