package proyecto_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CLIENTES extends JFrame {

	private JPanel contentPane;
	private JTextField TFclienteID;
	private JTextField TFclienteNombe;
	private JTextField TFclienteMail;
	private JTextField TFclienteTel;
	private JTextField TFclienteID_Cliente;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public CLIENTES() {
		setTitle("Clientes");
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
		
		JButton BclienteGuardar = new JButton("Guardar Datos");
		BclienteGuardar.setBackground(Color.WHITE);
		BclienteGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BclienteGuardar.setBounds(30, 171, 135, 23);
		panel.add(BclienteGuardar);
		
		JButton BclienteActualizar = new JButton("Actualizar Datos");
		BclienteActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BclienteActualizar.setBackground(Color.WHITE);
		BclienteActualizar.setBounds(30, 205, 135, 23);
		panel.add(BclienteActualizar);
		
		TFclienteID = new JTextField();
		TFclienteID.setBounds(78, 47, 106, 20);
		panel.add(TFclienteID);
		TFclienteID.setColumns(10);
		
		TFclienteNombe = new JTextField();
		TFclienteNombe.setBounds(78, 78, 106, 20);
		panel.add(TFclienteNombe);
		TFclienteNombe.setColumns(10);
		
		TFclienteMail = new JTextField();
		TFclienteMail.setBounds(78, 109, 106, 20);
		panel.add(TFclienteMail);
		TFclienteMail.setColumns(10);
		
		TFclienteTel = new JTextField();
		TFclienteTel.setBounds(78, 140, 106, 20);
		panel.add(TFclienteTel);
		TFclienteTel.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 50, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 81, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mail");
		lblNewLabel_2.setBounds(10, 112, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tel:");
		lblNewLabel_3.setBounds(10, 143, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DATOS DEL CLIENTE");
		lblNewLabel_4.setBounds(55, 11, 115, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ID cliente");
		lblNewLabel_5.setBounds(240, 42, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		TFclienteID_Cliente = new JTextField();
		TFclienteID_Cliente.setBounds(306, 39, 86, 20);
		contentPane.add(TFclienteID_Cliente);
		TFclienteID_Cliente.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Modificar Datos");
		lblNewLabel_6.setBounds(278, 11, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton BclienteBorrar = new JButton("Borrar Datos de Cliente");
		BclienteBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BclienteBorrar.setBackground(Color.GRAY);
		BclienteBorrar.setBounds(231, 107, 193, 81);
		contentPane.add(BclienteBorrar);
		
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
		
		JButton BclienteBuscar = new JButton("Buscar");
		BclienteBuscar.setBackground(Color.GRAY);
		BclienteBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BclienteBuscar.setBounds(278, 67, 89, 23);
		contentPane.add(BclienteBuscar);
	}
}
