package uf2179;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaMultas extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JComboBox comboSancion;
	private JLabel lblresImporte;
	private JTextArea textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMultas frame = new VentanaMultas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaMultas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][][grow]", "[24.00][][][][][][grow]"));
		
		JLabel lblTitulo = new JLabel("DGT - Infracciones");
		lblTitulo.setBackground(Color.BLUE);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setOpaque(true);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblTitulo, "cell 0 0 5 1,growx");
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		contentPane.add(lblMatricula, "cell 1 1,alignx trailing");
		
		textMatricula = new JTextField();
		contentPane.add(textMatricula, "cell 2 1,growx");
		textMatricula.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		contentPane.add(lblNombre, "cell 3 1,alignx trailing");
		
		textNombre = new JTextField();
		contentPane.add(textNombre, "cell 4 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		contentPane.add(lblApellidos, "cell 1 2,alignx trailing");
		
		textApellidos = new JTextField();
		contentPane.add(textApellidos, "cell 2 2 3 1,growx");
		textApellidos.setColumns(10);
		
		JLabel lblSancion = new JLabel("Sancion:");
		contentPane.add(lblSancion, "cell 1 3,alignx trailing");
		
		comboSancion = new JComboBox();
		comboSancion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				CalcularImporte();
			}
		});
		comboSancion.setModel(new DefaultComboBoxModel(new String[] {"", "No llevar casco", "Conduci\u00F3n temeraria"}));
		contentPane.add(comboSancion, "cell 2 3 3 1,growx");
		
		JLabel lblImporte = new JLabel("Importe:");
		contentPane.add(lblImporte, "cell 1 4,alignx right");
		
		 lblresImporte = new JLabel("");
		contentPane.add(lblresImporte, "cell 2 4");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrarResultado();
			}
		});
		contentPane.add(btnAceptar, "cell 1 5 4 1,alignx center");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 6 4 1,grow");
		
		textResultado = new JTextArea();
		textResultado.setEditable(false);
		textResultado.setLineWrap(true);
		scrollPane.setViewportView(textResultado);
	}

	protected void CalcularImporte() {
		String seleccionado = (String) comboSancion.getSelectedItem();
		if (seleccionado.equals("No llevar casco")) {
			 lblresImporte.setText("200");
		} else  {
			 lblresImporte.setText("500");
		}
		
	}

	protected void mostrarResultado() {
		int precio = Integer.parseInt(lblresImporte.getText());
		double prontoPago = precio/2;
		String sancion = (String) comboSancion.getSelectedItem();
		double precioFinal = precio-prontoPago;
		textResultado.setText("Conductor: "+ textNombre.getText()+" "+ textApellidos.getText()+ "\n"+
								"Infraccion: "+ sancion + "\n"+
								"Importe: " + precio + "\n"+
								"Pronto pago: "+ precioFinal );
	}

}
