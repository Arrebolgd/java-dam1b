package _13_Array_Jedi;

import java.util.Scanner;

public class _8_Generar_Banderas {

	public static void main(String[] args) {

		/*
		 * Vamos a crear un programa en Java que genere banderas de colores aleatorios.
		 * 
		 * 
		 * Disponemos de un array de cadenas de texto con varios colores posibles para las 
		 * franjas de la bandera: rojo, amarillo, verde, azul, blanco y negro.
		 * 
		 * El programa debe pedir al usuario cuántas franjas quiere para la 
		 * bandera y, a continuación, mostrará por pantalla los colores de cada 
		 * franja generados aleatoriamente.
		 */
		
		Scanner input = new Scanner(System.in);
		String[] colores = {"rojo", "amarillo", "verde", "azul", "blanco", "negro"};
		int numColores;
		
		System.out.println("Introduce el numero de colores que quieres para la bandera: ");
		numColores = input.nextInt();
		
		for(int i = 0; i <= numColores-1; i++) {
			System.out.println(colores[(int) (Math.random()*6)]);
		}
		
		
		
		
		input.close();
	}

}
