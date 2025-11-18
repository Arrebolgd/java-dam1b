package _13_Array_Jedi;

public class _7_Diez_Veces {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 
		 * 
		 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
		 */
		
		
		int[] arrayEnteros;
		int arrayLenght = 0;
		int indice = 0;
		
		for(int i = 1; i <= 10; i++)
			arrayLenght += i;
		
		arrayEnteros = new int[arrayLenght];
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 0; j <= i-1; j++) {
				
				arrayEnteros[indice] = i;
				indice++;
			}
		}
		
		
		for(int numero: arrayEnteros)
			System.out.println(numero);
		
	}

}
