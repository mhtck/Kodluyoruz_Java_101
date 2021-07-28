package digerKonular;

import java.util.Scanner;

public class PolidromikKelime {
	public static boolean isPolidrom(String str) {
	     String tmp = "";
	        for (int i = str.length()-1; i >= 0 ; i--) {
	            tmp += str.charAt(i);
	        }
	        if(str.equals(tmp)) {
	        	return true;
	        }else {
	            return false;
	        }
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(isPolidrom(A));

	}

}
