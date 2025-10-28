package mision1;

import java.util.Scanner;

public class Fernandez_Manuel_mision1 {

	public static void main(String args[]) {

		// Variables para manipulación del menu
		//		- Uso "default" para recoger cualquier valor no contemplado en el menu
		int entradaMenu = -1;
		Scanner input = new Scanner(System.in);

		// 1. Variables para valorar estado del portal
		final int ENERGIA_PORTAL_CALIBRADO = 35;
		
		int energiaPortal = 0;
		int contadorIntentos = 0;
		// Guardo en un boolean para verificar si se ha calibrado el portal
		boolean calibrarPortal = false;

		
		// 2. No inicializo "day" ni "month" por que no me hacen falta para la condición de ningun proceso
		// 		- Solo necesito su asignación durante este
		//		- Pongo el nombre de las variables en ingles por no poner "ano"
		int day;
		int month;
		int year;
		
		// He creado la constante para no poner los números 28 y 29 sin contexto en el código
		final int DIAS_FEBRERO = 28;
		
		// Guardo en un "boolean" si es o no año bisiesto, para cuando tenga que asignar días
		boolean bisiesto = false;
		
		// Guardo en un "boolean" si se ha calibrado la fecha
		boolean calibrarFecha = false;

		// 3. Valor total de crones acumulados
		int crones = 0;

		do {
			// Uso las """ por que creo que es mejor que poner 8 - System.out.println + los presentes en el resto del ejercicio.
			// 		- 8 no es un número aleatorio por dramatizar, necesitaría 8 "System.out.println" o multiples "\n"
			//		- Y no estoy usando una función que no hayas explicado...
			
			System.out.println("""
					---- CENTRO DE CONTROL TEMPORAL ----

					1. Calibrar el Portal

					2. Establecer fecha de viaje

					3. Mostrar la carga temporal acumulada

					4. Iniciar viaje

					0. Salir

					-------------------------------------

					Elige una opción:
					""");
			entradaMenu = input.nextInt();
			
			switch (entradaMenu) { 
			case 1:
				System.out.println("""
						========================================
							Calibrar el portal
						========================================
						Introduce la cantidad de energía:
						""");
				// Uso un "do while" por si el usuario acierta a la primera la asignación, evitar comprobar la condición 2 veces
				do {
					energiaPortal = input.nextInt();

					if (energiaPortal > 35) {
						System.out.println("""
								La energía introducida es demasiado alta...
								Introduce la cantidad de energía de nuevo:
								""");

					} else if (energiaPortal < 35) {
						System.out.println("""
								La energía introducida es demasiado baja...
								Introduce la cantidad de energía de nuevo:
								""");
					}
					contadorIntentos++;

				} while (energiaPortal != ENERGIA_PORTAL_CALIBRADO);

				System.out.println(" El portal ha sido calibrado, numero de intentos: " + contadorIntentos);

				// Confirmo la calibración del portal
				calibrarPortal = true;
				crones += 10;
				break;

			case 2:

				// No añado condiciones por lo laxa que es la variable, pudiendo ser negativa (A.C) o incluso "0"
				System.out.println("Introduce el año: ");
				year = input.nextInt();
				
				// Confirmo si el año es bisiesto
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					bisiesto = true;
				}
				
				do {
					System.out.println("Introduce el mes: ");
					month = input.nextInt();
					
					if(month > 0 && month <= 12) {
						break;
					}else {
						System.out.println("\"Las coordenadas son inestables\"");
					}
				} while (true);

				do {
					System.out.println("Introduce el día: ");
					day = input.nextInt();
					
					/*
					 * Se viene explicación larga...
					 * Uso un "switch"  para evitar "if's" innecesariamente complejos para lo simple que es la condición.
					 * A mayores aprovecho la estructura del "switch" para recoger los errores.
					 * 
					 * Si los valores facilitados son correctos, rompo el "switch" con un "break" y termino la ejecución del "do while"
					 * 
					 * Si los valores NO son correctos, continuo el "switch" hasta el "default" que informa del error
					 * en el valor introducido y reasigna a "day" el valor "-1" para que continue el "do while"
					 */
					
					switch(month) {
						
						// Meses de 30 días
						case 4,6,9, 11:
							if(day >= 1 && day <=  30) {
								break;
							}
						
						// Meses de 31 días
						case 1, 3, 5, 7, 8, 10, 12:
							if(day >=  1 && day <= 31) {
								break;
							}
						
						// Febrero
						case 2:
							if(bisiesto == false && (day >= 1 && day <= DIAS_FEBRERO) ||
								(bisiesto == true && (day >= 1 && day <=  DIAS_FEBRERO+1))){
								break;
							}
						default:
							System.out.println("\"Las coordenadas son inestables\"");
							day = -1;
					}
					
				}while(day == -1);

				System.out.println("\"Las coordenadas son estables\"");
				crones += 5;
				calibrarFecha = true;
				break;

			case 3:
				System.out.println("\"Tu carga temporal es de " + crones + " crones\"\n");
				break;

			case 4:
				if(calibrarPortal == true) {
					if(calibrarFecha == true) {
						if(crones >= 10) {
							System.out.println("""
									\"Activando portal...
									
									Coordenadas estables...
									
									¡Salto temporal realizado con exito!\"
									""");
							entradaMenu = 0;
						}else {
							System.out.println("\"Error: carga temporal insuficiente. Se necesitan al menos 10 crones para abrir el portal.\"");
						}
					}else {
						System.out.println("\"Error: coordenadas temporales inestables. Introduce una fecha de destino correcta.\"");
					}
				}else {
					System.out.println("\"Error: el portal no está calibrado. Realiza la calibración antes de iniciar el viaje.\"");
				}
				break;
			default:
					System.out.println("\"Opción no válida. Por favor, selecciona una opción del 0 al 4\"");
			}

		} while (entradaMenu != 0);

		System.out.println("\"Desconectando sistema temporal... Hasta el próximo salto\"");
		input.close();
	}
}
