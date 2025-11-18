package __12_Array_Padawan;

import java.util.Scanner;

public class _5_N_M {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida dos valores enteros N y M, luego cree un array de
		 * tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
		 */
		
		int N;
		Scanner input = new Scanner(System.in);
		System.out.println("· Indica el tamaño del Array: ");
		N = input.nextInt();
		
		int[] elArray = new int[N];
		
		int M;
		System.out.println("· Con que numero quieres rellenar el array ?");
		M = input.nextInt();
		
		for(int i = 0; i <= elArray.length-1; i++) {
			elArray[i] = M;
		}
		for(int i : elArray) {
			System.out.println(i);
		}
		
		input.close();
	}

}
