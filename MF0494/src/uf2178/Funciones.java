package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * Método de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * Método para mostrar por pantalla el vector pasado como parámetro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	/**
	 * Apartado 1
	 * @param tasa
	 */
	public static void calculaSancion(double tasa){
		Scanner entrada = new Scanner(System.in);
		String multa = "";
		
		if(tasa < 0.25) {
			multa = "sin sancion";
			} else if(tasa >= 0.25 && tasa < 0.50) {
			multa = "500€ y pérdida de 4 puntos";
			} else if(tasa >= 0.50 && tasa < 0.60) {
			multa = "1000€ y pérdida de 6 puntos";
			} else if(tasa >= 0.60) {
			multa = "Retirada del carnet y de 3 a 6 meses de cárcel";
			}
		System.out.printf("el conductor tiene una tasa de alcoholemia de: "+tasa+ " y eso conlleva la sancion de: "+ multa);	
	}

	
	/**
	 * Apartado 2
	 * @param v
	 * @param v2
	 */
	public static void restaPuntos(int v[], int v2[]) {

		for (int i = 0; i < v.length; i++) {
		v[i]-=v2[i];
		if (v[i] < 0)
		v[i] = 0;

		}
	}
		
}
