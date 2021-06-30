package donguler.asalSayi;

public class AsalSayi {

	public static void main(String[] args) {
		
		
		for(int i = 2 ; i <= 100 ; i++) {
			boolean check = false;
			
			for(int j = 2; j < i ; j++) {
				if(i % j == 0 && i != j) {
					check = true;
					
				}
			}
			
			if(!check) {
				System.out.print(i + " ");
			}
		}

	}

}
