package proyecto_final;

import Queries.CacheReader;
import Queries.QProductos;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FACTURACION extends JFrame {

    private JPanel contentPane;
    private JTextField TFcantidad_Productos;
    private JTable table;
 

    public FACTURACION() throws IOException {
        setTitle("FACTURACION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 564, 457);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //      Lee cache para alamecenar el usuario activo 
        CacheReader lectorCache = new CacheReader();
        String stmA;

        int ID = lectorCache.leerCache();

        stmA = "select `PRNombre`, `IDPR` from `usuario`, `proveedores`, `productos`, `proveedor_producto`, `usuario_proveedor`  where `IDU` = " + ID + " and `IDUPUsuario` = `IDU` and `IDPV` = `IDUPProveedor` and `IDPV` = `IDPPProveedor` and `IDPR` = `IDPPProducto`;";



        JButton btnNewButton = new JButton("Regresar");
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int res = JOptionPane.showConfirmDialog(null, "Realmente desea regresar?", "Confirmar regresar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (res == 0) {
                    Ventana uno = new Ventana();
                    dispose();
                } else {

                }
            }
        });
        btnNewButton.setBounds(434, 384, 104, 23);
        contentPane.add(btnNewButton);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setForeground(Color.WHITE);
        panel.setBounds(10, 11, 221, 127);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("ID CLIENTE");
        lblNewLabel.setBounds(84, 11, 112, 14);
        panel.add(lblNewLabel);

        JComboBox comboBox_clientes = new JComboBox();
        comboBox_clientes.setBounds(10, 36, 201, 22);
        panel.add(comboBox_clientes);

        JButton BT_ACEPTAR = new JButton("ACEPTAR");
        BT_ACEPTAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        BT_ACEPTAR.setBackground(Color.WHITE);
        BT_ACEPTAR.setBounds(10, 71, 201, 23);
        panel.add(BT_ACEPTAR);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.CYAN);
        panel_2.setBounds(241, 11, 297, 312);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 11, 277, 290);
        panel_2.add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        	},
        	new String[] {
        		"Nombre", "Cantidad ", "Precio unitario"
        	}
        ));
        table.getColumnModel().getColumn(2).setPreferredWidth(113);
        scrollPane.setViewportView(table);

       

        JButton BT_IMPRIMIR_FACTURA = new JButton("IMPRIMIR FACTURA");
        BT_IMPRIMIR_FACTURA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        BT_IMPRIMIR_FACTURA.setForeground(Color.WHITE);
        BT_IMPRIMIR_FACTURA.setBackground(Color.LIGHT_GRAY);
        BT_IMPRIMIR_FACTURA.setBounds(10, 336, 221, 71);
        contentPane.add(BT_IMPRIMIR_FACTURA);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.GRAY);
        panel_1.setBounds(10, 149, 221, 176);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("PRODUCTO");
        lblNewLabel_2.setBounds(80, 11, 88, 14);
        panel_1.add(lblNewLabel_2);

        JComboBox comboBox_Productos = new JComboBox();
        comboBox_Productos.setBounds(10, 36, 201, 22);
          //Dumpear consulta en un array y popular el comboBox     
        //Dump inicio
        QProductos uno = new QProductos();
        String tres[] = new String[uno.run(stmA).size()];
        for (int i = 0; i < tres.length; i++) {
            tres[i] = (String) uno.run(stmA).get(i + 1);
        }
        for (int i = 0; i < tres.length; i++) {
            comboBox_Productos.addItem(tres[i]);

        }

        //Dump end
        panel_1.add (comboBox_Productos);

    TFcantidad_Productos  = new JTextField();

    TFcantidad_Productos.setBounds (

    10, 96, 201, 20);
    panel_1.add (TFcantidad_Productos);

    TFcantidad_Productos.setColumns (
    10);
		
		JButton BT_AGREGAR = new JButton("AGREGAR");

    BT_AGREGAR.addActionListener ( new ActionListener() {
			

    public void actionPerformed(ActionEvent e) {
    }
}
);
		BT_AGREGAR.setBounds(69, 127, 89, 23);
		panel_1.add(BT_AGREGAR);
		BT_AGREGAR.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cantidad de productos ");
		lblNewLabel_2_1.setBounds(56, 71, 133, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JButton BT_Borrar = new JButton("Borrar seleccionado");
		BT_Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BT_Borrar.setBounds(241, 384, 164, 23);
		contentPane.add(BT_Borrar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(241, 321, 297, 54);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("IVA:");
		lblNewLabel_1.setBounds(88, 11, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("TOTAL:");
		lblNewLabel_3.setBounds(88, 29, 46, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel lbIVA = new JLabel(".............................");
		lbIVA.setBounds(179, 11, 108, 14);
		panel_3.add(lbIVA);
		
		JLabel lbTOTAL = new JLabel(".............................");
		lbTOTAL.setBounds(179, 29, 108, 14);
		panel_3.add(lbTOTAL);
		
		
		
	
		setLocationRelativeTo(null);
	}
}
