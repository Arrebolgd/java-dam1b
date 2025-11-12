package __11_Array;

import java.util.Scanner;

public class Fernandez_Manuel_7_Lenght_Consola {

	public static void main(String args[]) {
		/*
		 * Modifica el ejercicio 5 para que al principio del programa nos pida cuántas
		 * posiciones queremos que tenga el vector y sea este dato el que utilicemos
		 * para darle dimensión.
		 */
		
		Scanner input = new Scanner(System.in);
		int longitudArray;
		
		System.out.println("· Indica la longitud del array: ");
		longitudArray = input.nextInt();
		
		if(longitudArray <= 0) {
			System.out.println("· Número no válido.");
		}else {
			int[] elArray = new int[longitudArray];
			for(int i = 0; i <= elArray.length-1; i++) {
				elArray[i] = i;
				System.out.println(elArray[i]);
			}
		}
		
		input.close();
		
	}
}
