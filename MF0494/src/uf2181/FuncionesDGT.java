/**
 * 
 */
package uf2181;

/**
 * @author David Cruz Aranda
 *
 */
public class FuncionesDGT {
	
/**
 * Funcion que pide añadir numeros enteros a un vector, este nos devolvera la media de los numeros que hemos añadido en el vector.
 * Por ejemplo si añadimos un vector 1,2,3,4,5 nos devolvera el resultado 5 ((1+2+3+4+5)/5).
 * @param puntos int, es el vector con el que se realiza la media
 * @return double, con el resultado de la media.
 * @throws ArrayIndexOutOfBoundsException si el vector tiene el tamaño 0
 */
	public double mediaPuntos(int puntos[]) {
		double suma = 0;
		
		for (int i = 0; i < puntos.length; i++) {
			suma = suma +puntos[i];
		}
		if (puntos.length==0) throw new ArrayIndexOutOfBoundsException();
		return suma/puntos.length;
	}
	/**
	 * Funcion que nos muestra la tasa de alcohol dependiendo si el conductor es Nobel o no. Tanto en sangre, como en aire expirado
	 * @param tipoConductor String, persona que va dirigido el test, ya sea en sangre o aire
	 * @param aire boolean, si es true es por aire y si es false es por sangre
	 * @return double, devuelve la tasa maxima de alcohol comprobando primero si es nobel o no.
	 */
	public double maximaTasaPermitida(String tipoConductor, boolean aire) {
		double tasa=0.25;
		if (tipoConductor.equalsIgnoreCase("General")) {
			if (aire) {
				tasa=0.25;
			} else {
				tasa=0.5;
			}
		} else {
			// profesionales y noveles
			if (aire) {
				tasa=0.15;
			} else {
				tasa=0.3;
			}
		}
		return tasa;
	}

	
}
