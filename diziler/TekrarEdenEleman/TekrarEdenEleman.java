package diziler.TekrarEdenEleman;
import java.util.*;
public class TekrarEdenEleman {

	public static void main(String[] args) {
		
		
		int[] dizi = {1,5,7,9,2,3,1,9,5,7,21,44,34,3,2,1};
		int[] find = new int[dizi.length];
		
		for (int i : dizi) {
			boolean check = false;
			for (int j = 0; j < find.length; j++) {
				if(find[j] == i) {
					check = true;
				}
			}
			if(!check) {
				for (int j = 0; j < find.length; j++) {
					if(find[j] == 0) {
						find[j] = i;
						break;
					}
				}
			}
			
			
		}
		
		System.out.println(Arrays.toString(dizi));
		System.out.println(Arrays.toString(find));

	}

}
