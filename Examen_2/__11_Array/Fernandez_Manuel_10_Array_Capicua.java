package __11_Array;

import java.util.Scanner;

public class Fernandez_Manuel_10_Array_Capicua {

	public static void main(String[] args) {
		/*
		 * Construir un programa que pida al usuario 10 números enteros, los almacene
		 * en un array, e indique en pantalla si dicho array es capicúa, es decir, si
		 * la secuencia de sus elementos es igual vista de delante hacia atrás y de
		 * detrás hacia delante.
		 */

		Scanner input = new Scanner(System.in);
		int[] elArray = new int[10];
		int indiceInverso = elArray.length-1;
		boolean capicua = true;
		
		for(int i = 0; i <= elArray.length-1; i++) {
			System.out.println("· Introduce el nº " + (i + 1) + ": ");
			elArray[i] = input.nextInt();
		}
		
		for(int i: elArray) {			
			if(i != elArray[indiceInverso]) {
				capicua = false;
				break;
			}
			indiceInverso--;
		}
		System.out.println("· El array es capicua? " + capicua);
		input.close();
		
	}

}
