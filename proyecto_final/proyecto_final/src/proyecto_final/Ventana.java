package proyecto_final;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel.setBackground(Color.LIGHT_GRAY);
        jMenuBar = new javax.swing.JMenuBar();
        jMenuBar.setBackground(new Color(0, 0, 0));
        jMenuBar.setForeground(Color.WHITE);
        jMenu1 = new javax.swing.JMenu();
        jMenu1.setForeground(Color.WHITE);
        jMenu2 = new javax.swing.JMenu();
        jMenu2.setForeground(Color.WHITE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        btnClientes.setBounds(15, 281, 387, 265);
        btnClientes.setIcon(new ImageIcon(Ventana.class.getResource("/images/Clients-icon.png")));
        

        btnClientes.setForeground(Color.BLACK);
        btnClientes.setBackground(Color.DARK_GRAY);
        btnClientes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
   
        		try {
        			CLIENTES frame = new CLIENTES();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
        	}
        });
        btnProductos.setBounds(422, 281, 387, 265);
        btnProductos.setIcon(new ImageIcon(Ventana.class.getResource("/images/Productos.png")));
        

        btnProductos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			PRODUCTOS frame = new PRODUCTOS();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
        	}
        });
        btnProductos.setForeground(Color.BLACK);
        btnProductos.setBackground(Color.DARK_GRAY);
        btnProveedores.setBounds(15, 5, 387, 265);
        btnProveedores.setIcon(new ImageIcon(Ventana.class.getResource("/images/Proveedores.png")));
        

        btnProveedores.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			PROVEEDORES frame = new PROVEEDORES();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
        	}
        });
        btnProveedores.setForeground(Color.BLACK);
        btnProveedores.setBackground(Color.DARK_GRAY);
        btnFacturacion.setBounds(422, 5, 387, 265);
        btnFacturacion.setIcon(new ImageIcon(Ventana.class.getResource("/images/Facturacion.png")));
        

        btnFacturacion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			FACTURACION frame = new FACTURACION();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
        	}
        });
        btnFacturacion.setForeground(Color.BLACK);
        btnFacturacion.setBackground(Color.DARK_GRAY);

        jMenu1.setText("File");
        jMenuBar.add(jMenu1);
        
        menuBar_1 = new JMenuBar();
        jMenu1.add(menuBar_1);
        
        mntmNewMenuItem = new JMenuItem("Proveedores");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			PROVEEDORES frame = new PROVEEDORES();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
        	}
        });
        jMenu1.add(mntmNewMenuItem);
        
        mntmNewMenuItem_5 = new JMenuItem("Clientes");
        mntmNewMenuItem_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			CLIENTES frame = new CLIENTES();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
        	}
        });
        jMenu1.add(mntmNewMenuItem_5);
        
        mntmNewMenuItem_4 = new JMenuItem("Productos");
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			PRODUCTOS frame = new PRODUCTOS();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
        	}
        });
        jMenu1.add(mntmNewMenuItem_4);
        
        mntmNewMenuItem_1 = new JMenuItem("Facturacion");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			FACTURACION frame = new FACTURACION();
					frame.setVisible(true);
					dispose();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
        	}
        });
        jMenu1.add(mntmNewMenuItem_1);

        jMenu2.setText("Edit");
        jMenuBar.add(jMenu2);
        
        mntmNewMenuItem_2 = new JMenuItem("New menu item");
        jMenu2.add(mntmNewMenuItem_2);
        
        mntmNewMenuItem_3 = new JMenuItem("New menu item");
        jMenu2.add(mntmNewMenuItem_3);
        
        menuBar = new JMenuBar();
        jMenu2.add(menuBar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel, GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);
        jPanel.setLayout(null);
        jPanel.add(btnProveedores);
        jPanel.add(btnClientes);
        jPanel.add(btnFacturacion);
        jPanel.add(btnProductos);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel;
    private JMenuItem mntmNewMenuItem;
    private JMenuItem mntmNewMenuItem_1;
    private JMenuBar menuBar;
    private JMenuItem mntmNewMenuItem_2;
    private JMenuItem mntmNewMenuItem_3;
    private JMenuBar menuBar_1;
    private JMenuItem mntmNewMenuItem_4;
    private JMenuItem mntmNewMenuItem_5;
    JButton btnClientes = new JButton("CLIENTES");
    JButton btnFacturacion = new JButton("FACTURACION");   
    JButton btnProductos = new JButton("PRODUCTOS");
    JButton btnProveedores = new JButton("PROVEEDORES");
}
