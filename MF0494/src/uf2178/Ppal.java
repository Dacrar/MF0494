/**
 * 
 */
package uf2178;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class Ppal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Escribe aquí las sentencias del apartado 3
		
		Scanner entrada = new Scanner(System.in);
	
			System.out.println("Introduce la tasa de alcoholemia");
			double tasa = entrada.nextDouble();
			Funciones.calculaSancion(tasa);
			
			int puntos[] = new int [6];
			int sanciones[] = new int [6];
			System.out.println("Introducir el vector puntos: ");
			Funciones.pedir_vector(puntos);
			System.out.println("Introducir el vector sanciones: ");
			Funciones.pedir_vector(sanciones);
			System.out.println("Tu vector puntos es: ");
			Funciones.mostrar_vector(puntos);
			System.out.println("Tu vector sanciones es: ");
			Funciones.mostrar_vector(sanciones);
			Funciones.restaPuntos(puntos, sanciones);
			System.out.println("La resta de puntos es:");
			Funciones.mostrar_vector(puntos);
		
		
		
			
	}

}
