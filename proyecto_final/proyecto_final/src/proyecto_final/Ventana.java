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
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        JButton btnNewButton = new JButton("CLIENTES");
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.DARK_GRAY);
        btnNewButton.addActionListener(new ActionListener() {
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
        
        JButton btnNewButton_1 = new JButton("PRODUCTOS");
        btnNewButton_1.addActionListener(new ActionListener() {
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
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBackground(Color.DARK_GRAY);
        
        JButton btnNewButton_2 = new JButton("PROVEEDORES");
        btnNewButton_2.addActionListener(new ActionListener() {
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
        btnNewButton_2.setForeground(Color.WHITE);
        btnNewButton_2.setBackground(Color.DARK_GRAY);
        
        JButton btnNewButton_3 = new JButton("FACTURACION");
        btnNewButton_3.addActionListener(new ActionListener() {
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
        btnNewButton_3.setForeground(Color.WHITE);
        btnNewButton_3.setBackground(Color.DARK_GRAY);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanelLayout.setHorizontalGroup(
        	jPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelLayout.createSequentialGroup()
        			.addGroup(jPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        				.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
        );
        jPanelLayout.setVerticalGroup(
        	jPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelLayout.createSequentialGroup()
        			.addGroup(jPanelLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(jPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        				.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
        );
        jPanel.setLayout(jPanelLayout);

        jMenu1.setText("File");
        jMenuBar.add(jMenu1);
        
        mntmNewMenuItem = new JMenuItem("New menu item");
        jMenu1.add(mntmNewMenuItem);
        
        menuBar_1 = new JMenuBar();
        jMenu1.add(menuBar_1);
        
        mntmNewMenuItem_5 = new JMenuItem("New menu item");
        jMenu1.add(mntmNewMenuItem_5);
        
        mntmNewMenuItem_4 = new JMenuItem("New menu item");
        jMenu1.add(mntmNewMenuItem_4);
        
        mntmNewMenuItem_1 = new JMenuItem("New menu item");
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
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
}