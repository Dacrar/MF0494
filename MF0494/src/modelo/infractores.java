/**
 * 
 */
package modelo;

import java.util.Objects;

/**
 * @author David
 *
 */
public class infractores {

	private String dni;
	private String nombre;
	private String apellidos;
	private int antiguedad;
	private Float sancion;
	private int puntos;
	
	
	public infractores() {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
	}

	public infractores(String dni, String nombre, String apellidos, int antiguedad, Float sancion, int puntos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.antiguedad = antiguedad;
		this.sancion = sancion;
		this.puntos = puntos;
	}

	/**
	 * @return el dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni el dni a establecer
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos el apellidos a establecer
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return el antiguedad
	 */
	public int getAntiguedad() {
		return antiguedad;
	}

	/**
	 * @param antiguedad el antiguedad a establecer
	 */
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	/**
	 * @return el sancion
	 */
	public Float getSancion() {
		return sancion;
	}

	/**
	 * @param sancion el sancion a establecer
	 */
	public void setSancion(Float sancion) {
		this.sancion = sancion;
	}

	/**
	 * @return el puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos el puntos a establecer
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		infractores other = (infractores) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "infractores [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", antiguedad="
				+ antiguedad + ", sancion=" + sancion + ", puntos=" + puntos + "]";
	}
	
	
	
	
	
	
	
	
}
