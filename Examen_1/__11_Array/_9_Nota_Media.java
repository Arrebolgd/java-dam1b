package __11_Array;

import java.util.Scanner;

public class _9_Nota_Media {

	public static void main(String[] args) {
		/*
		 * Realizar un programa Java que inicialice un vector de tipo numérico de tipo
		 * flotante llamado notas de 3 elementos cuyos valores serán solicitados e
		 * introducidos por teclado por el usuario.
		 * 
		 * El programa calcula y muestra la media obtenida.
		 */
		
		Scanner input = new Scanner(System.in);
		float[] notas = new float[3];
		float media = 0;
		int i;
		
		for(i = 0; i <= notas.length-1; i++) {
			System.out.println("· Introduce la nota nº " + (i + 1) + ": ");
			notas[i] = input.nextFloat();
		}
		
		for(float f : notas)
			media += f;
		
		media /= i;
		System.out.println("· Nota media: " + media);
		
		input.close();
	}

}
