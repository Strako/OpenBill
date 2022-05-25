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

public class PROVEEDORES extends JFrame {

	private JPanel contentPane;
	private JTextField TFproveedoresID;
	private JTextField TFproveedoresNombre;
	private JTextField TFproveedoresMail;
	private JTextField TFproveedoresTel;
	private JTextField TFproveedoresID_Proveedores;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PROVEEDORES() {
		setTitle("PROVEEDORES");
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
		
		JButton BproveedoresGuardar = new JButton("Guardar Datos");
		BproveedoresGuardar.setBackground(Color.WHITE);
		BproveedoresGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BproveedoresGuardar.setBounds(34, 171, 138, 23);
		panel.add(BproveedoresGuardar);
		
		JButton BproveedoresActualizar = new JButton("Actualizar Datos");
		BproveedoresActualizar.setBackground(Color.WHITE);
		BproveedoresActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BproveedoresActualizar.setBounds(34, 205, 138, 23);
		panel.add(BproveedoresActualizar);
		
		TFproveedoresID = new JTextField();
		TFproveedoresID.setBounds(78, 47, 106, 20);
		panel.add(TFproveedoresID);
		TFproveedoresID.setColumns(10);
		
		TFproveedoresNombre = new JTextField();
		TFproveedoresNombre.setBounds(78, 78, 106, 20);
		panel.add(TFproveedoresNombre);
		TFproveedoresNombre.setColumns(10);
		
		TFproveedoresMail = new JTextField();
		TFproveedoresMail.setBounds(78, 109, 106, 20);
		panel.add(TFproveedoresMail);
		TFproveedoresMail.setColumns(10);
		
		TFproveedoresTel = new JTextField();
		TFproveedoresTel.setBounds(78, 140, 106, 20);
		panel.add(TFproveedoresTel);
		TFproveedoresTel.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 50, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 81, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mail:");
		lblNewLabel_2.setBounds(10, 112, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tel:");
		lblNewLabel_3.setBounds(10, 143, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DATOS DE PROVEEDOR");
		lblNewLabel_4.setBounds(43, 11, 129, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ID Proveedor");
		lblNewLabel_5.setBounds(240, 42, 72, 14);
		contentPane.add(lblNewLabel_5);
		
		TFproveedoresID_Proveedores = new JTextField();
		TFproveedoresID_Proveedores.setBounds(318, 39, 86, 20);
		contentPane.add(TFproveedoresID_Proveedores);
		TFproveedoresID_Proveedores.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Modificar Datos");
		lblNewLabel_6.setBounds(278, 11, 99, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton BproveedoresBorrar_Datos = new JButton("Borrar Datos");
		BproveedoresBorrar_Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BproveedoresBorrar_Datos.setBackground(Color.GRAY);
		BproveedoresBorrar_Datos.setBounds(240, 104, 179, 81);
		contentPane.add(BproveedoresBorrar_Datos);
		
		JButton btnNewButton_3 = new JButton("REGRESAR");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.BLACK);
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
		
		JButton BproveedoresBuscar = new JButton("Buscar");
		BproveedoresBuscar.setBackground(Color.GRAY);
		BproveedoresBuscar.setForeground(Color.BLACK);
		BproveedoresBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BproveedoresBuscar.setBounds(289, 67, 89, 23);
		contentPane.add(BproveedoresBuscar);
	}
}
