package __12_Array_Padawan;

import java.util.Scanner;

public class _6_P_Q {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
		 * contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
		 */
		
		int P = 0;
		int Q = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("· Indica el valor de P: ");
		P = input.nextInt();
		
		System.out.println("· Indica el valor de Q: ");
		Q = input.nextInt();
		
		if(Q <= P) {
			System.out.println("· El valor de P debe ser menor que el de Q");
		}else {
			int[] elArray = new int[(Q-P)+1];
			for(int i = 0; i <= elArray.length-1; i++) {
				elArray[i] = P;
				P++;
			}
			for(int i : elArray) {
				System.out.println(i);
			}
		}
		
		input.close();
		// CAMBIO PARA IOMAR
	}

}
