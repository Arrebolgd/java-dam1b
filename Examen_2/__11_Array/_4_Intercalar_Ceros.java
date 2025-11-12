package __11_Array;

public class _4_Intercalar_Ceros {

	public static void main(String args[]) {
		/*
		 *  A partir del siguiente array {2, 3, 4, 7, 8, 10, 11} 
		 *  obtener otro con ceros intercalados entre sus posiciones {2, 0, 3, 0, 4, 0, …}
		 */
		
		int[] arrayNumbers1 = {2, 3, 4, 7, 8, 10, 11};
		int[] arrayNumbers2 = new int[(arrayNumbers1.length*2)];
		
		for(int i = 0; i <= arrayNumbers2.length-1; i++) {
			if(i % 2 != 0) {
				System.out.println(arrayNumbers2[i]);
			}else {
				arrayNumbers2[i] = arrayNumbers1[i/2];
				System.out.println(arrayNumbers2[i]);
			}
		}
	}
}
