package _14_Manipulacion_Arrays;

import java.util.Arrays;

public class _4_Buscar_Array {

	public static void main(String[] args) {

		/*
		 * Crea cada uno de los arrays y utiliza el método binarySearch para buscar el
		 * valor correspondiente en cada uno (Recuerda que antes debes ordenar el array,
		 * para ello utiliza el método Sort)
		 * 
		 * 
		 * Muestra por pantalla la posición de cada uno de los valores:
		 * 
		 * Para byte byteArr[] = {10,20,15,22,35}  busca el valor byte byteKey = 35;
		 * Para  char charArr[] = {'g','p','q','c','i'}  busca el valor char charKey = 'g';
		 * Para int intArr[] = {10,20,15,22,35}  busca el valor int intKey = 22;
		 * Para double doubleArr[] = {10.2,15.1,2.2,3.5}  busca el valor double doubleKey = 1.5;
		 * Para float floatArr[] = {10.2f,15.1f,2.2f,3.5f}  busca el valor  float floatKey = 3.5f;
		 * Para short shortArr[] = {10,20,15,22,35}  busca el valor  short shortKey = 5;
		 */
		
		byte byteArr[] = {10,20,15,22,35};
		byte byteKey = 35;
		Arrays.sort(byteArr);
		System.out.println("Posición de 35: " + (Arrays.binarySearch(byteArr, byteKey)));
		
		char charArr[] = {'g','p','q','c','i'};
		char charKey = 'g';
		System.out.println("Posición de g: " + (Arrays.binarySearch(charArr, charKey)));
		
		int intArr[] = {10,20,15,22,35};
		int intKey = 22;
		System.out.println("Posición de 22: " + (Arrays.binarySearch(intArr, intKey)));
		
		double doubleArr[] = {10.2,15.1,2.2,3.5};
		double doubleKey = 1.5;
		System.out.println("Posición de 22: " + (Arrays.binarySearch(doubleArr, doubleKey)));
		
		float floatArr[] = {10.2f,15.1f,2.2f,3.5f};
		float floatKey = 3.5f;
		System.out.println("Posición de 22: " + (Arrays.binarySearch(floatArr, floatKey)));
		
		short shortArr[] = {10,20,15,22,35};
		short shortKey = 5;
		System.out.println("Posición de 22: " + (Arrays.binarySearch(shortArr, shortKey)));
	}

}
