package proyecto_final;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PRODUCTOS  extends JFrame {

	private JPanel contentPane;
	private JTextField TFproductosID;
	private JTextField TFproductosNombre;
	private JTextField TFproductosPrecio;
	private JTextField TFproductosID_Productos;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PRODUCTOS() {
		setTitle("PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		  setLocationRelativeTo(null);
		  
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 11, 211, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton BproductosGuardar_Datos = new JButton("Guardar Datos");
		BproductosGuardar_Datos.setBackground(Color.WHITE);
		BproductosGuardar_Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		BproductosGuardar_Datos.setBounds(34, 171, 126, 23);
		panel.add(BproductosGuardar_Datos);
		
		JButton BproductosActualizar_Datos = new JButton("Actualizar Datos");
		BproductosActualizar_Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BproductosActualizar_Datos.setBackground(Color.WHITE);
		BproductosActualizar_Datos.setBounds(34, 205, 126, 23);
		panel.add(BproductosActualizar_Datos);
		
		TFproductosID = new JTextField();
		TFproductosID.setBounds(78, 47, 106, 20);
		panel.add(TFproductosID);
		TFproductosID.setColumns(10);
		
		TFproductosNombre = new JTextField();
		TFproductosNombre.setBounds(78, 78, 106, 20);
		panel.add(TFproductosNombre);
		TFproductosNombre.setColumns(10);
		
		TFproductosPrecio = new JTextField();
		TFproductosPrecio.setBounds(78, 109, 106, 20);
		panel.add(TFproductosPrecio);
		TFproductosPrecio.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 50, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 81, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio:");
		lblNewLabel_2.setBounds(10, 112, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Datos de Producto");
		lblNewLabel_4.setBounds(54, 11, 136, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ID Producto");
		lblNewLabel_5.setBounds(231, 42, 82, 14);
		contentPane.add(lblNewLabel_5);
		
		TFproductosID_Productos = new JTextField();
		TFproductosID_Productos.setBounds(323, 39, 86, 20);
		contentPane.add(TFproductosID_Productos);
		TFproductosID_Productos.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Modificar Datos");
		lblNewLabel_6.setBounds(278, 11, 94, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton BproductosBORRAR_DATOS = new JButton("BORRAR DATOS");
		BproductosBORRAR_DATOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BproductosBORRAR_DATOS.setBackground(Color.GRAY);
		BproductosBORRAR_DATOS.setBounds(245, 117, 179, 81);
		contentPane.add(BproductosBORRAR_DATOS);
		
		JButton btnNewButton_3 = new JButton("REGRESAR");
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res =	JOptionPane.showConfirmDialog(null, "Realmente desea regresar?", "Confirmar regresar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(res == 0) {
					Ventana uno = new Ventana();
					dispose();
				}else {
					
				}
			}
		});
		btnNewButton_3.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton BproductosBuscar = new JButton("Buscar");
		BproductosBuscar.setBackground(Color.GRAY);
		BproductosBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BproductosBuscar.setBounds(283, 67, 89, 23);
		contentPane.add(BproductosBuscar);
	}
}
