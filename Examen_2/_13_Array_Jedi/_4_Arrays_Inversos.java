package _13_Array_Jedi;

public class _4_Arrays_Inversos {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
		 * introducirá en el primer array todos los valores del 1 al 100. Por último,
		 * deberá copiar todos los valores del primer array al segundo array en orden
		 * inverso, y mostrar ambos por pantalla.
		 */
		
		int[] arrayDerecho = new int[100];
		int[] arrayInverso = new int[100];
		
		int contadorInverso = 99;
		
		for(int i = 0; i <= arrayDerecho.length-1; i++) {
			arrayDerecho[i] = (i+1);
			arrayInverso[contadorInverso] = arrayDerecho[i];
			contadorInverso--;
		}
		
		System.out.println("· Array derecho: ");
		for(int i : arrayDerecho) {
			System.out.println(i);
		}
		
		System.out.println("· Array inverso: ");
		for(int i : arrayInverso) {
			System.out.println(i);
		}

	}

}
