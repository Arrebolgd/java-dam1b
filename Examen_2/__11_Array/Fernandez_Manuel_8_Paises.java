package __11_Array;

import java.util.Scanner;

public class Fernandez_Manuel_8_Paises {

	public static void main(String args[]) {
		/*
		 * Crea un vector(array) de tamaño 5, al que llamarás países. En él guardarás
		 * los nombres de 5 países que se introducirán por teclado. En un bucle
		 * posterior al de la inicialización del vector, muestra su contenido.
		 */

		Scanner input = new Scanner(System.in);
		String[] paises = new String[5];
		
		for(int i = 0; i <= paises.length-1; i++) {
			System.out.println("· Introduce el país nº " + (i+1) + ": ");
			paises[i] = input.next();
		}
		for(String i : paises) {
			System.out.println(i);
		}
		
		input.close();
	}
}
