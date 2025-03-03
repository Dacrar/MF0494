/**
 * 
 */
package controlador;

import java.util.ArrayList;

import dao.InfractoresDAO;
import dao.SancionDAO;

import modelo.Sancion;
import modelo.infractores;
import vista.DialogoInsertarInfractor;
import vista.VentanaMostrarInfractores;
import vista.VentanaPpal;

/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema
	private VentanaPpal ventanaPpal;
	private DialogoInsertarInfractor dialogoInsertarInfractor;
	private VentanaMostrarInfractores ventanaMostrarInfractores;

	
	// Objetos DAO o CRUD de la base de datos
	private SancionDAO sancionDAO;
	private InfractoresDAO infractoresDAO;

	
	public Controlador() {
		// Creamos las ventanas de la aplicación
		ventanaPpal = new VentanaPpal();
		dialogoInsertarInfractor = new DialogoInsertarInfractor();
		ventanaMostrarInfractores = new VentanaMostrarInfractores();
		
		// Dando acceso al controlador desde las vistas
		ventanaPpal.setControlador(this);
		dialogoInsertarInfractor.setControlador(this);
		ventanaMostrarInfractores.setControlador(this);
		
		
		// Creamos los objetos DAO
		sancionDAO = new SancionDAO();
		infractoresDAO = new InfractoresDAO();
	}
	
	public void inciarPrograma() {
		ventanaPpal.setVisible(true);
	}

	public void mostrarInsertarInfractores () {
		ArrayList<Sancion> listaSanciones = new ArrayList<Sancion>();
		listaSanciones = sancionDAO.obtenerSanciones();
		dialogoInsertarInfractor.setListaSanciones(listaSanciones);
		dialogoInsertarInfractor.setVisible(true);
	}
	
	public void mostrarListarInfractores() {
		ArrayList<infractores> lista = infractoresDAO.obtenerInfractores();
		ventanaMostrarInfractores.setListaInfractores(lista);
		ventanaMostrarInfractores.setVisible(true);
	}
	
}
