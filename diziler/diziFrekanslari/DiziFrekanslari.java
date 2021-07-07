package diziler.diziFrekanslari;

public class DiziFrekanslari {

	public static void main(String[] args) {
		int[] dizi = { 1, 1, 7, 9, 1, 3, 1, 9, 5, 7, 21, 44, 5, 3, 5, 1 };
		int[][] find = new int[dizi.length][2];
		for (int i : dizi) {
			boolean check = false;
			for (int j = 0, l = 0; j < find.length; j++) {
				if (find[j][l] == i) {
					check = true;
					find[j][l + 1]++;
				}
			}
			if (!check) {
				for (int j = 0, l = 0; j < find.length; j++) {
					if (find[j][l] == 0) {
						find[j][l] = i;
						find[j][l + 1]++;
						break;
					}
				}
			}
		}
		for (int i = 0, j = 0; i < find.length; i++) {
			if (find[i][j] == 0) {
				break;
			}
			System.out.println(find[i][j] + " . nin frekansı : " + find[i][j + 1]);
		}
	}
}
