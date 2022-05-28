package proyecto_final;

import Queries.CacheReader;
import Queries.QClientesCampos;
import Queries.QUsuario;
import Queries.UpClientes;
import Queries.comboBox;
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
import java.io.IOException;

public class CLIENTES extends JFrame {

    private JPanel contentPane;
    private JTextField TFclienteID;
    private JTextField TFclienteNombre;
    private JTextField TFclienteMail;
    private JTextField TFclienteTel;
    private JTextField TFclienteID_Cliente;
    String stm1, stm2, stm3;
    String stmCampos, stmActualizar;
   
    String borrar = "";

    /* Launch the application.
     */

    /**
     * Create the frame.
     */
    public CLIENTES() throws IOException {
        setTitle("Clients");
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

        //Lee cache para alamecenar el usuario activo 
        CacheReader lectorCache = new CacheReader();
        //Escribe el usuario activo en cache para posterior uso
        ID = lectorCache.leerCache();
        System.out.println(ID);


        BclienteGuardar.setBackground(Color.WHITE);
        BclienteGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                stm1 = "INSERT INTO `clientes` (`IDCL`, `CLNombre`, `CLMail`, `CLTelefono`) VALUES (NULL, '" + TFclienteNombre.getText() + "', '" + TFclienteMail.getText() + "', '" + TFclienteTel.getText() + "');";
                System.out.println(stm1);
                guardar.updateClientes(stm1);
                
                stm2 = "select `IDCL` from `clientes` ORDER BY `IDCL` DESC LIMIT 1;";
                System.out.println(stm2);
                System.out.println(ultimoID.run(stm2));

                
                stm3 = "INSERT INTO `usuario_cliente` (`IDUCUsuario`, `IDUCCliente`) VALUES ('"+ ID +"', '"+ ultimoID.run(stm2) +"');";
                System.out.println(stm3);
                System.out.println(ultimoID);
                lClienteCreado.setText("ID Creado: " + String.valueOf(ultimoID.run(stm2)));
                guardar.run(stm3);


            }
        });
        BclienteGuardar.setBounds(30, 171, 135, 23);
        panel.add(BclienteGuardar);

        BclienteActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stmActualizar = "UPDATE `clientes` SET `CLNombre` = '"+ TFclienteNombre.getText() +"', `CLMail` = '"+ TFclienteMail.getText() +"', `CLTelefono` = '"+ TFclienteTel.getText() +"' WHERE `clientes`.`IDCL` = "+ TFclienteID_Cliente.getText() +"";
                actualizar.run(stmActualizar);
                
            }
        });
        BclienteActualizar.setBackground(Color.WHITE);
        BclienteActualizar.setBounds(30, 205, 135, 23);
        panel.add(BclienteActualizar);

        TFclienteNombre = new JTextField();
        TFclienteNombre.setBounds(78, 78, 106, 20);
        panel.add(TFclienteNombre);
        TFclienteNombre.setColumns(10);

        TFclienteMail = new JTextField();
        TFclienteMail.setBounds(78, 109, 106, 20);
        panel.add(TFclienteMail);
        TFclienteMail.setColumns(10);

        TFclienteTel = new JTextField();
        TFclienteTel.setBounds(78, 140, 106, 20);
        panel.add(TFclienteTel);
        TFclienteTel.setColumns(10);

        lClienteNombre.setBounds(10, 81, 46, 14);
        panel.add(lClienteNombre);

        lClienteCreado.setBounds(80, 49, 115, 14);
        panel.add(lClienteCreado);
        
        lClienteMail.setBounds(10, 112, 46, 14);
        panel.add(lClienteMail);

        lClienteTel.setBounds(10, 143, 46, 14);
        panel.add(lClienteTel);

        lClienteData.setBounds(55, 11, 115, 14);
        panel.add(lClienteData);

        lClienteID.setBounds(240, 42, 46, 14);
        contentPane.add(lClienteID);

        TFclienteID_Cliente = new JTextField();
        TFclienteID_Cliente.setBounds(306, 39, 86, 20);
        contentPane.add(TFclienteID_Cliente);
        TFclienteID_Cliente.setColumns(10);

        lClienteModData.setBounds(278, 11, 86, 14);
        contentPane.add(lClienteModData);

        BclienteBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            borrar = "DELETE FROM `clientes` WHERE `clientes`.`IDCL` = "+ TFclienteID_Cliente.getText() +";";
            eliminar.updateClientes(borrar);
 
}
        });
        BclienteBorrar.setBackground(Color.GRAY);
        BclienteBorrar.setBounds(231, 107, 193, 81);
        contentPane.add(BclienteBorrar);

        btnNewButton_3.setBackground(Color.BLACK);
        btnNewButton_3.setForeground(Color.WHITE);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int res = JOptionPane.showConfirmDialog(null, "Realmente desea regresar?", "Confirmar regresar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (res == 0) {
                    Ventana uno = new Ventana();
                    dispose();
                } else {

                }
            }

        });
        btnNewButton_3.setBounds(335, 227, 89, 23);
        contentPane.add(btnNewButton_3);

        BclienteBuscar.setBackground(Color.GRAY);
        BclienteBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                stmCampos = "select * from `clientes` where `IDCL` = "+ TFclienteID_Cliente.getText() +";";
                TFclienteNombre.setText(String.valueOf(buscarCliente.run(stmCampos).get(1)));     
                TFclienteMail.setText(String.valueOf(buscarCliente.run(stmCampos).get(2)));     
                TFclienteTel.setText(String.valueOf(buscarCliente.run(stmCampos).get(3)));     
                
                
            }
        });
        BclienteBuscar.setBounds(278, 67, 89, 23);
        contentPane.add(BclienteBuscar);
    }
    JLabel lClienteNombre = new JLabel("Nombre");
    JLabel lClienteCreado = new JLabel("ID");
    JLabel lClienteMail = new JLabel("Mail");
    JLabel lClienteTel = new JLabel("Tel:");
    JLabel lClienteModData = new JLabel("Modificar Datos");
    JButton BclienteBorrar = new JButton("Borrar Datos de Cliente");
    JButton btnNewButton_3 = new JButton("REGRESAR");
    JLabel lClienteID = new JLabel("ID cliente");
    JLabel lClienteData = new JLabel("DATOS DEL CLIENTE");
    JButton BclienteActualizar = new JButton("Actualizar Datos");
    JButton BclienteGuardar = new JButton("Guardar Datos");
    UpClientes guardar = new UpClientes();
    UpClientes eliminar = new UpClientes();
    UpClientes actualizar = new UpClientes();
    JButton BclienteBuscar = new JButton("Buscar");
    QUsuario ultimoID = new QUsuario();
    int ID = 0;
    QClientesCampos buscarCliente = new QClientesCampos();

}
