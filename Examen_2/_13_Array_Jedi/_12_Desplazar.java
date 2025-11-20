package _13_Array_Jedi;

public class _12_Desplazar {

	public static void main(String[] args) {

		/*
		 * Escribe un programa en Java que lea 15 números por teclado y que los almacene
		 * en un array.
		 * 
		 * Desplaza los elementos de ese array una posición, es decir, el elemento de la
		 * posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que
		 * se encuentra en la última posición debe pasar a la posición 0.
		 * 
		 * Finalmente, muestra el contenido del array.
		 */
		
		int[] array1 = new int[15];
		int[] array2 = new int[15];
		
		for(int i = 0; i <= array1.length-1; i++ )
			array1[i] = i+1;
		
		array2 = array1;
		
		System.out.print("· ");
		
		for(int i : array1)
			System.out.print(i);
		
		System.out.print("· ");
		
		for(int i : array2)
			System.out.print(i);
		
		for(int i = 0; i <= array1.length-1; i++) {
			
			if(i == 0)
				array1[0] = array2[14];
			else
				array1[i] = array2[(i-1)]; // TODO
		}
		
		System.out.print("\n· ");
		
		for(int i : array1)
			System.out.print(i);

	}

}
