package bitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static int SUTUN;
	static int SATIR;
	static int MAYINSAYISI;
	static String[][] tarla;
	static int[][] mayinKonumlari;

	static void tarlaEmpty() {
		for (int i = 0; i < tarla.length; i++) {
			for (int j = 0; j < tarla[i].length; j++) {
				tarla[i][j] = "?";
			}
		}
	}

	static void display() {
		System.out.println("------------------------------------");
		for (int i = 0; i < tarla.length; i++) {
			for (int j = 0; j < tarla[i].length; j++) {
				System.out.print(tarla[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
	}

	static void secretDisplay() {
		System.out.println("------------------------------------");
		for (int i = 0; i < tarla.length; i++) {
			for (int j = 0; j < tarla[i].length; j++) {
				if (tarla[i][j].equals("*")) {
					System.out.print("?" + " ");
				} else {
					System.out.print(tarla[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
	}

	static void mayinDuse() {
		Random rand = new Random();

		for (int i = 0; i < MAYINSAYISI; i++) {
			int tmpSatir = rand.nextInt(SATIR);
			int tmpSutun = rand.nextInt(SUTUN);

			if (tarla[tmpSatir][tmpSutun].equals("?")) {
				tarla[tmpSatir][tmpSutun] = "*";
			}
		}
	}

	static boolean select(int satir, int sutun) {
		if (!tarla[satir][sutun].equals("*")) {
			tarla[satir][sutun] = "-";
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("~~~ Mayın Tarlasına Hoşgeldin ~~~");
		System.out.println("Tarla Alanı Belirle");
		System.out.print("En : ");
		SUTUN = scan.nextInt();
		System.out.print("Boy : ");
		SATIR = scan.nextInt();
		System.out.print("Mayın Sayısı : ");
		MAYINSAYISI = scan.nextInt();

		tarla = new String[SATIR][SUTUN];
		mayinKonumlari = new int[SATIR][SUTUN];

		tarlaEmpty();
		mayinDuse();
		System.out.println();
		for (int i = 0; i < 5; i++) {
			secretDisplay();
			System.out.println("Konum belirle");
			System.out.print("En : ");
			int satir = scan.nextInt();
			System.out.print("Boy : ");
			int sutun = scan.nextInt();
			
			if(!select(satir, sutun)) {
				System.out.println("BOOOOM !!!!");
				display();
				break;
			}
			
			if (i == 4) {
				System.out.println("OOOOLey Kazandın");
				display();
			}

		}
		

	}

}
