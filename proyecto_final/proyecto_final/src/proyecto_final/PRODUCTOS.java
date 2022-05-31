package proyecto_final;

import Queries.QClientesCampos;
import Queries.QProductosCampos;
import Queries.QUsuario;
import Queries.UpClientes;
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
	private JTextField TFproductosPV;
	private JTextField TFproductosNombre;
	private JTextField TFproductosPrecio;
	private JTextField TFproductosPV_Productos;
        String stm1, stm2, stm3;
        String stmCampos, borrar, stmActualizar;
        int ID;

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
		

		BproductosGuardar_Datos.setBackground(Color.WHITE);
		BproductosGuardar_Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                stm1 = "INSERT INTO `productos` (`IDPR`, `PRNombre`, `PRPrecio`) VALUES (NULL, '" + TFproductosNombre.getText() + "', '" + TFproductosPrecio.getText() + "');";
                System.out.println(stm1);
                guardar.updateClientes(stm1);
                
                stm2 = "select `IDPR` from `productos` ORDER BY `IDPR` DESC LIMIT 1;";
                System.out.println(stm2);
                System.out.println(ultimoID.run(stm2));

                
                stm3 = "INSERT INTO `proveedor_producto` (`IDPPProveedor`, `IDPPProducto`) VALUES ('"+ Integer.valueOf(TFproductosPV.getText()) +"', '"+ ultimoID.run(stm2) +"');";
                System.out.println(stm3);
                System.out.println(ultimoID);
                lblProductoCreado.setText("ID Creado: " + String.valueOf(ultimoID.run(stm2)));
                guardar.run(stm3);

				
			}
		});
		BproductosGuardar_Datos.setBounds(34, 171, 126, 23);
		panel.add(BproductosGuardar_Datos);
		

		BproductosActualizar_Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                stmActualizar = "UPDATE `productos` SET `PRNombre` = '"+ TFproductosNombre.getText() +"', `PRPrecio` = '"+ TFproductosPrecio.getText() +"' WHERE `productos`.`IDPR` = "+ TFproductosPV_Productos.getText() +";";
                actualizar.run(stmActualizar);
                            
			}
		});
		BproductosActualizar_Datos.setBackground(Color.WHITE);
		BproductosActualizar_Datos.setBounds(34, 205, 126, 23);
		panel.add(BproductosActualizar_Datos);
		
		TFproductosPV = new JTextField();
		TFproductosPV.setBounds(78, 47, 106, 20);
		panel.add(TFproductosPV);
		TFproductosPV.setColumns(10);
		
		TFproductosNombre = new JTextField();
		TFproductosNombre.setBounds(78, 78, 106, 20);
		panel.add(TFproductosNombre);
		TFproductosNombre.setColumns(10);
		
		TFproductosPrecio = new JTextField();
		TFproductosPrecio.setBounds(78, 109, 106, 20);
		panel.add(TFproductosPrecio);
		TFproductosPrecio.setColumns(10);
		

                lblProductoCreado.setBounds(80, 19, 115, 14);
		panel.add(lblProductoCreado);
                
		lblProductoPV.setBounds(10, 50, 46, 14);
		panel.add(lblProductoPV);
		

		lblProductoNombre.setBounds(10, 81, 46, 14);
		panel.add(lblProductoNombre);
		

		lblProductoPrecio.setBounds(10, 112, 46, 14);
		panel.add(lblProductoPrecio);
				

		lblProductoID.setBounds(231, 42, 82, 14);
		contentPane.add(lblProductoID);
		
		TFproductosPV_Productos = new JTextField();
		TFproductosPV_Productos.setBounds(323, 39, 86, 20);
		contentPane.add(TFproductosPV_Productos);
		TFproductosPV_Productos.setColumns(10);
		

		lblProductoMod.setBounds(278, 11, 94, 14);
		contentPane.add(lblProductoMod);
		

		BproductosBORRAR_DATOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                        borrar = "DELETE FROM `productos` WHERE `productos`.`IDPR` = "+ TFproductosPV_Productos.getText() +";";
                        eliminar.updateClientes(borrar);
                            
			}
		});
		BproductosBORRAR_DATOS.setBackground(Color.GRAY);
		BproductosBORRAR_DATOS.setBounds(245, 117, 179, 81);
		contentPane.add(BproductosBORRAR_DATOS);
		
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
		

		BproductosBuscar.setBackground(Color.GRAY);
		BproductosBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                                                                  
                stmCampos = "select * from `productos` where `IDPR` = "+ TFproductosPV_Productos.getText() +";";   
                TFproductosNombre.setText(String.valueOf(buscarProducto.run(stmCampos).get(1)));     
                TFproductosPrecio.setText(String.valueOf(buscarProducto.run(stmCampos).get(2)));    
                
			}
		});
		BproductosBuscar.setBounds(283, 67, 89, 23);
		contentPane.add(BproductosBuscar);
	}
		JLabel lblProductoCreado = new JLabel("ID:");    
                JLabel lblProductoPV = new JLabel("Proveedor:");    
		JLabel lblProductoNombre = new JLabel("Nombre:");
		JLabel lblProductoPrecio = new JLabel("Precio:");
		JLabel lblProductoID = new JLabel("ID Producto");
                JLabel lblProductoMod = new JLabel("Modificar Datos");
		JButton BproductosBORRAR_DATOS = new JButton("BORRAR DATOS");
		JButton btnNewButton_3 = new JButton("REGRESAR");
		JButton BproductosBuscar = new JButton("Buscar");         
		JButton BproductosActualizar_Datos = new JButton("Actualizar Datos");                
		JButton BproductosGuardar_Datos = new JButton("Guardar Datos");           
                UpClientes guardar = new UpClientes();
                QUsuario ultimoID = new QUsuario();
                QProductosCampos buscarProducto = new QProductosCampos();
                UpClientes eliminar = new UpClientes();
                UpClientes actualizar = new UpClientes();

}
