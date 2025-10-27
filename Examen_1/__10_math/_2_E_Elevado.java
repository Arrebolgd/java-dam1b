package __10_math;

import java.util.Scanner;

public class _2_E_Elevado {

	public static void main(String[] args) {
		/*
		 * Capturamos un número por teclado y queremos saber el valor de e elevado a ese número.
		 */

		final double EULER = Math.E;
		double resultado; 
		
		Scanner input = new Scanner(System.in);
		
		int potencia = -1;
		
		while(potencia != 0){
			
			System.out.println("· Introduce un numero: ");
			potencia = input.nextInt();
			if(potencia == 0) {
				break;
			}
			resultado = Math.pow(EULER, potencia);
			System.out.println(resultado);
		};
		
		input.close();
	}

}
