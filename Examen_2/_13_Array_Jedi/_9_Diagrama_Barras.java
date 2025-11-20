package _13_Array_Jedi;

import java.util.Scanner;

public class _9_Diagrama_Barras {

	public static void main(String[] args) {

		/*
		 * Realiza un programa en Java que pida la temperatura media que ha hecho en
		 * cada mes de un determinado año y que muestre a continuación un diagrama de
		 * barras horizontales con esos datos.
		 * 
		 * Las barras del diagrama se pueden dibujar a base de 'o'
		 */
		
		Scanner input = new Scanner(System.in);
		final int MESES = 12;
		int[] temperaturas = new int[12];
		int mes = 1;
		
		for(int i = 1; i <= MESES; i++){
			
			System.out.println("Introduce la temperatura del mes: " + i);
			temperaturas[i-1] = input.nextInt();
		}
		
		for(int i : temperaturas) {
			System.out.print("Mes " + mes + ":");
			for(int j = 0; j <= i; j++) {
				System.out.print("▮");
			}
			System.out.print("\n");
			mes++;
		}
		input.close();
	}

}
