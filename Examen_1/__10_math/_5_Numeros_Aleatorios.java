package __10_math;

public class _5_Numeros_Aleatorios {

	public static void main(String args[]) {
		/*
		 * Genera número aleatorios enteros  comprendidos entre 100 y 250.
		 */
		
		for(int i = 0; i != 20; i++) {
			System.out.println("· " + (int)(Math.random()*151 + 100));
			
		}
		
	}
}
