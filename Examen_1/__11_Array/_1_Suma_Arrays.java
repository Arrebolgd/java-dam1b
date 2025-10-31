package __11_Array;

public class _1_Suma_Arrays {
	
	public static void main(String args[]) {
		int[] arrayNumbers1 = {1, 3, 5, 7, 8};
		int[] arrayNumbers2 = {1, 2, 3, 4, 5};
		int[] resultado = new int[5];
		
		for(int i = 0; i <= arrayNumbers1.length-1; i++) {
			resultado[i] = arrayNumbers1[i] + arrayNumbers2[i];
			System.out.println(resultado[i]);
		}
	}
}