package _15_Manipulacion_Arrays_2;

import java.util.Arrays;

public class _6_Array_String_Char {

	public static void main(String[] args) {

		/*
		 * A partir del siguiente array de caracteres [‘a’, ‘b’, ‘f’, ‘g’, ‘e’, ‘i’, ‘o’, ‘p’, ‘x’]
		 * 
		 * obtener un array de Strings donde los caracteres del array anterior estén
		 * agrupados de 3 en 3. Es decir, obtener el array [“abf”, “gei”, “opx”]
		 */
		
		char[] arrayChar = {'a', 'b', 'f', 'g', 'e', 'i', 'o', 'p', 'x'};
		String[] arrayString = new String[arrayChar.length/3];
		String word = "";
		int secondIndex = 0;
		int thirdIndex = 0;
		
		for(int i = 0; i <= arrayChar.length-1; i++) {
			word += arrayChar[i];
			secondIndex++;
			
			if(secondIndex == 3) {
				arrayString[thirdIndex] = word;
				word = "";
				secondIndex = 0;
				thirdIndex++;
			}
		}
		
		System.out.println(Arrays.toString(arrayString));
	}
}
