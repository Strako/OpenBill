package proyecto_final;

import Queries.CacheReader;
import Queries.FindPrecio;
import Queries.QProductos;
import Queries.SanitizeID;
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
        String stmClientes;

        int ID = lectorCache.leerCache();

        stmA = "select `PRNombre`, `IDPR` from `usuario`, `proveedores`, `productos`, `proveedor_producto`, `usuario_proveedor`  where `IDU` = " + ID + " and `IDUPUsuario` = `IDU` and `IDPV` = `IDUPProveedor` and `IDPV` = `IDPPProveedor` and `IDPR` = `IDPPProducto`;";
        //End Leer cache

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

        lblNewLabel.setBounds(84, 11, 112, 14);
        panel.add(lblNewLabel);

        JComboBox comboBox_clientes = new JComboBox();
        comboBox_clientes.setBounds(10, 36, 201, 22);

        //Dumpear consulta en un array y popular el comboBox     
        //Dump inicio
        stmClientes = "select `CLNombre`, `IDCL` from `usuario`, `clientes`, `usuario_cliente` where `IDU` = " + ID + " and `IDUCUsuario` = `IDU` and `IDUCCliente` = `IDCL`;";
        QProductos dos = new QProductos();
        String cuatro[] = new String[dos.run(stmClientes).size()];
        for (int i = 0; i < cuatro.length; i++) {
            cuatro[i] = (String) dos.run(stmClientes).get(i + 1);
        }
        for (int i = 0; i < cuatro.length; i++) {
            comboBox_clientes.addItem(cuatro[i]);

        }

//Dump end
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
                new Object[][]{},
                new String[]{
                    "Nombre", "Cantidad ", "Precio unitario"
                }
        ));
        
        model = (DefaultTableModel) table.getModel();
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
        panel_1.add(comboBox_Productos);

        TFcantidad_Productos = new JTextField();

        TFcantidad_Productos.setBounds(
                10, 96, 201, 20);
        panel_1.add(TFcantidad_Productos);

        TFcantidad_Productos.setColumns(
                10);

        JButton BT_AGREGAR = new JButton("AGREGAR");

        BT_AGREGAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	if(TFcantidad_Productos.getText().equals("")){
            		 JOptionPane.showConfirmDialog(null, "ERROR", "INGRESA UNA CANITDAD", JOptionPane.WARNING_MESSAGE);
                     
                }
                else
                {    
	
                productoNombre = String.valueOf(comboBox_Productos.getSelectedItem());
                System.out.println(productoNombre);
                
                productoCantidad = Integer.valueOf(TFcantidad_Productos.getText());
                System.out.println(productoCantidad);
                
                productoPrecio = obtenerPrecio.obetenerPrecio(sanitizarID.extraerID(String.valueOf(comboBox_Productos.getSelectedItem())));
                System.out.println(productoPrecio);
                
                total = total + (productoPrecio * productoCantidad);
                iva = (float) (iva + ((productoPrecio * productoCantidad) * 0.16));
                System.out.println(total + "  " + iva);
                
                model.addRow(new Object[]{productoNombre, productoCantidad, productoPrecio});
                
                System.out.println(model.getValueAt(model.getRowCount() - 1, 2));
                
                lblRTotal.setText(String.valueOf(total));
                lblRIVA.setText(String.valueOf(iva));
                
                
                }
            }
        }
        );
        BT_AGREGAR.setBounds(69, 127, 89, 23);
        panel_1.add(BT_AGREGAR);
        BT_AGREGAR.setBackground(Color.WHITE);


        lblNewLabel_2_1.setBounds(56, 71, 133, 14);
        panel_1.add(lblNewLabel_2_1);


        BT_Borrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                dIVA = (float) ((float) model.getValueAt(table.getSelectedRow(), 2) * 0.16) * (int) model.getValueAt(table.getSelectedRow(), 1);
                System.out.println(dIVA);
                
                dTotal = (float) model.getValueAt(table.getSelectedRow(), 2) * (int) model.getValueAt(table.getSelectedRow(), 1);
                System.out.println(dTotal);
                model.removeRow(table.getSelectedRow());
                
                dIVA = Float.valueOf(lblRIVA.getText()) - dIVA;
                if(dIVA < 0.01){
                    dIVA = 0;
                    iva = dIVA;
                    
                }else{
                    iva = dIVA;
                }
                
                dTotal = Float.valueOf(lblRTotal.getText()) - dTotal;
                total = dTotal;
                lblRIVA.setText(String.valueOf(dIVA));
                lblRTotal.setText(String.valueOf(dTotal));
                
            }
        });
        BT_Borrar.setBounds(241, 384, 164, 23);
        contentPane.add(BT_Borrar);

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(241, 321, 297, 54);
        contentPane.add(panel_3);
        panel_3.setLayout(null);


        lblIVA.setBounds(88, 11, 46, 14);
        panel_3.add(lblIVA);


        lblTotal.setBounds(88, 29, 46, 14);
        panel_3.add(lblTotal);


        lblRIVA.setBounds(179, 11, 108, 14);
        panel_3.add(lblRIVA);


        lblRTotal.setBounds(179, 29, 108, 14);
        panel_3.add(lblRTotal);

        setLocationRelativeTo(null);
    }
    JLabel lblNewLabel = new JLabel("ID CLIENTE");
    JLabel lblIVA = new JLabel("IVA:");    
    JLabel lblRIVA = new JLabel(".............................");
    JLabel lblTotal = new JLabel("TOTAL:");
    JLabel lblRTotal = new JLabel(".............................");
    SanitizeID sanitizarID = new SanitizeID();
    FindPrecio obtenerPrecio = new FindPrecio();
    JButton BT_Borrar = new JButton("Borrar seleccionado");    
    JLabel lblNewLabel_2_1 = new JLabel("Cantidad de productos ");
    String productoNombre;
    int productoCantidad;
    float  productoPrecio;
    float total = 0;
    float iva = 0;
    float operacion, dIVA, dTotal;
    DefaultTableModel model;


}
