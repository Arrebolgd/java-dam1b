package _15_Manipulacion_Arrays_2;

import java.util.Arrays;

public class _2_Separar_Tres {

	public static void main(String[] args) {

		/*
		 * Separar el siguiente array [2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18] en otros tres:
		 * 
		 * El primero tiene que contener todos los elementos menores de 10.
		 * El segundo los elementos entre 11 y 20.
		 * El tercero los elementos entre 21 y 30.
		 * 
		 * Los elementos mayores de 30 serán descartados y los arrays no pueden tener posiciones vacías.
		 */
		
		int[] arrayCore = {2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18};
		int contador1_10 = 0;
		int contador11_20 = 0;
		int contador21_30 = 0;
		
		int[] _1_10;
		int[] _11_20;
		int[] _21_30;
		
		for(int i : arrayCore) {
			if(i >= 1 && i <= 10)
				contador1_10++;
			if(i >= 11 && i <= 20)
				contador11_20++;
			if(i >= 21 && i <= 30)
				contador21_30++;
		}
		
		System.out.println("·" + contador1_10 + "·" + contador11_20 + "·" + contador21_30);
		_1_10 = new int[contador1_10];
		_11_20 = new int[contador11_20];
		_21_30 = new int[contador21_30];
		
		Arrays.sort(arrayCore);
		
		for(int i = 0; i <= _1_10.length-1; i++) {
			_1_10[i] = arrayCore[i];
			_11_20[i] = arrayCore[i+contador11_20];
			_21_30[i] = arrayCore[i+contador11_20+contador21_30];
		}
			
		
		for(int i : _1_10)
			System.out.println(i);
		
		for(int i : _11_20)
			System.out.println(i);
		
		for(int i : _21_30)
			System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
