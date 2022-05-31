package proyecto_final;

import Queries.CacheReader;
import Queries.QClientesCampos;
import Queries.QUsuario;
import Queries.UpClientes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PROVEEDORES extends JFrame {

	private JPanel contentPane;
	private JTextField TFproveedoresNombre;
	private JTextField TFproveedoresMail;
	private JTextField TFproveedoresTel;
	private JTextField TFproveedoresID_Proveedores;
        String stm1, stm2, stm3;
        String stmCampos, borrar, stmActualizar;
        int ID;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PROVEEDORES() throws IOException {
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
                
                //      Lee cache para alamecenar el usuario activo 
                CacheReader lectorCache = new CacheReader();
                ID =  lectorCache.leerCache();
		

		BproveedoresGuardar.setBackground(Color.WHITE);
		BproveedoresGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                stm1 = "INSERT INTO `proveedores` (`IDPV`, `PVNombre`, `PVMail`, `PVTelefono`) VALUES (NULL, '" + TFproveedoresNombre.getText() + "', '" + TFproveedoresMail.getText() + "', '" + TFproveedoresTel.getText() + "');";
                System.out.println(stm1);
                guardar.updateClientes(stm1);
                
                stm2 = "select `IDPV` from `proveedores` ORDER BY `IDPV` DESC LIMIT 1;";
                System.out.println(stm2);
                System.out.println(ultimoID.run(stm2));

                
                  stm3 = "INSERT INTO `usuario_proveedor` (`IDUPUsuario`, `IDUPProveedor`) VALUES ('"+ ID +"', '"+ ultimoID.run(stm2) +"');";
                System.out.println(stm3);
                System.out.println(ultimoID);
                lblProveedorCreado.setText("ID Creado: " + String.valueOf(ultimoID.run(stm2)));
                guardar.run(stm3);

			}
		});
		BproveedoresGuardar.setBounds(34, 171, 138, 23);
		panel.add(BproveedoresGuardar);
		

		BproveedoresActualizar.setBackground(Color.WHITE);
		BproveedoresActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                stmActualizar = "UPDATE `proveedores` SET `PVNombre` = '"+ TFproveedoresNombre.getText() +"', `PVMail` = '"+ TFproveedoresMail.getText() +"', `PVTelefono` = '"+ TFproveedoresTel.getText() +"' WHERE `proveedores`.`IDPV` = "+ TFproveedoresID_Proveedores.getText() +"";
                actualizar.run(stmActualizar);
                            
			}
		});
		BproveedoresActualizar.setBounds(34, 205, 138, 23);
		panel.add(BproveedoresActualizar);
		

		
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
		

		lblProveedorCreado.setBounds(80, 50, 115, 14);
		panel.add(lblProveedorCreado);
		

		lblProveedorNombre.setBounds(10, 81, 46, 14);
		panel.add(lblProveedorNombre);
		

		lblProveedorMail.setBounds(10, 112, 46, 14);
		panel.add(lblProveedorMail);
		

		lblProveedorTel.setBounds(10, 143, 46, 14);
		panel.add(lblProveedorTel);
		

		lblProveedorData.setBounds(43, 11, 129, 14);
		panel.add(lblProveedorData);
		

		lblProveedorID.setBounds(240, 42, 72, 14);
		contentPane.add(lblProveedorID);
		
		TFproveedoresID_Proveedores = new JTextField();
		TFproveedoresID_Proveedores.setBounds(318, 39, 86, 20);
		contentPane.add(TFproveedoresID_Proveedores);
		TFproveedoresID_Proveedores.setColumns(10);
		

		lblProveedorMod.setBounds(278, 11, 99, 14);
		contentPane.add(lblProveedorMod);
		

		BproveedoresBorrar_Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                        borrar = "DELETE FROM `proveedores` WHERE `proveedores`.`IDPV` = "+ TFproveedoresID_Proveedores.getText() +";";
                        eliminar.updateClientes(borrar);
                            
			}
		});
		BproveedoresBorrar_Datos.setBackground(Color.GRAY);
		BproveedoresBorrar_Datos.setBounds(240, 104, 179, 81);
		contentPane.add(BproveedoresBorrar_Datos);
		

		btnNewButton_3.setBackground(Color.WHITE);
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
		

		BproveedoresBuscar.setBackground(Color.GRAY);
		BproveedoresBuscar.setForeground(Color.BLACK);
		BproveedoresBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                                      
                stmCampos = "select * from `proveedores` where `IDPV` = "+ TFproveedoresID_Proveedores.getText() +";";
                TFproveedoresNombre.setText(String.valueOf(buscarProveedor.run(stmCampos).get(1)));     
                TFproveedoresMail.setText(String.valueOf(buscarProveedor.run(stmCampos).get(2)));     
                TFproveedoresTel.setText(String.valueOf(buscarProveedor.run(stmCampos).get(3)));    
                            
			}
		});
		BproveedoresBuscar.setBounds(289, 67, 89, 23);
		contentPane.add(BproveedoresBuscar);
	}
        
        JLabel lblProveedorCreado = new JLabel("ID");
	JLabel lblProveedorNombre = new JLabel("Nombre:"); 
	JLabel lblProveedorMail = new JLabel("Mail:");        
	JLabel lblProveedorTel = new JLabel("Tel:");
    	JLabel lblProveedorData = new JLabel("DATOS DE PROVEEDOR");
        JLabel lblProveedorID = new JLabel("ID Proveedor");
        JLabel lblProveedorMod = new JLabel("Modificar Datos");
	JButton BproveedoresBorrar_Datos = new JButton("Borrar Datos");       
        JButton btnNewButton_3 = new JButton("REGRESAR");
        JButton BproveedoresBuscar = new JButton("Buscar");
        JButton BproveedoresActualizar = new JButton("Actualizar Datos");
	JButton BproveedoresGuardar = new JButton("Guardar Datos");
        UpClientes guardar = new UpClientes();
        QUsuario ultimoID = new QUsuario();
        QClientesCampos buscarProveedor = new QClientesCampos();
        UpClientes eliminar = new UpClientes();
        UpClientes actualizar = new UpClientes();
}
