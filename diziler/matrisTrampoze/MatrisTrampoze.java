package diziler.matrisTrampoze;

public class MatrisTrampoze {

	public static void main(String[] args) {
		
		int[][] dizi= {{2,3,4},{5,6,7}};
		
		int[][] transpoze = new int[3][2];
		
		System.out.println("~~~~~~  Orjinal Dizi ~~~~~~");
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				transpoze[j][i] = dizi[i][j]; 
			}
		}
		System.out.println("~~~~~~  Dizinin Tranpozesi ~~~~~~");
		for (int i = 0; i < transpoze.length; i++) {
			for (int j = 0; j < transpoze[i].length; j++) {
				System.out.print(transpoze[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
