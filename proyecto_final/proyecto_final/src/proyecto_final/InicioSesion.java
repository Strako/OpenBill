package proyecto_final;

import Queries.CacheWriter;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.BorderLayout;
import Queries.QUsuario;

public class InicioSesion extends JFrame implements ActionListener {
	private JLabel etiqueta2;
            String userText;
            String pwdText;
            String stm;
//          String stm = "select `IDU` from `usuario` where `Usuario` =  'Zul' and `UClave` = '1234' ;";
            JPanel panel;
	    JLabel et1, et2;
	    JTextField txt1, txt2;
	    JButton btnIngresar, btnSalir;
	    String usu, pass;
	    JOptionPane mensaje;
            QUsuario respuesta = new QUsuario();
            CacheWriter cache = new CacheWriter();
	    private JLabel lblNewLabel;
	    private JLabel lblNewLabel_1;

	public InicioSesion() throws IOException {
		  setSize(445,305);
	        setLocationRelativeTo(null);
	        //setVisible(true);
	        setUndecorated(true);
	       
	    et1 = new JLabel("Usuario");
	    et1.setBounds(92, 132, 100, 20);
	    txt1 = new JTextField();
	    txt1.setBounds(200, 132, 154, 20);
		txt1.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				txt1ActionPerformed(evt);
			}
		});
	    
	    et2 = new JLabel("Contrasena");
	    et2.setBounds(92, 172, 100, 20);
	    txt2 = new JPasswordField();
	    txt2.setBounds(200, 172, 154, 20);
		txt2.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				txt2ActionPerformed(evt);
			}

		});
	    
	    btnIngresar = new JButton("Ingresar");
	    btnIngresar.setBounds(125, 219, 100, 20);
	    btnIngresar.addActionListener( this);
	        
	    btnSalir = new JButton("Salir");
	    btnSalir.setBounds(236, 219, 100, 20);
	    btnSalir.addActionListener( this);
	    
	    panel = new JPanel();
	             panel.setLayout(null);
	    
	             panel.add(et1);
	             panel.add(et2);
	             
	             panel.add(txt1);
	             panel.add(txt2);
	             
	             panel.add(btnIngresar);
	             panel.add(btnSalir);
	             
	     getContentPane().add(panel);
	     panel.setBackground(new Color(255, 255, 255));
	     
	     lblNewLabel_1 = new JLabel("BIENVENIDO");
	     lblNewLabel_1.setBounds(124, 11, 194, 110);
	     panel.add(lblNewLabel_1);
	     
	  
	     BufferedImage bufferedImage = ImageIO.read(getClass().getResource( "/images/usuario.jpg" ));
	        Image image = bufferedImage.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

	        ImageIcon icon = new ImageIcon(image);
	        JFrame frame = new JFrame();
	        frame.getContentPane().setLayout(new FlowLayout());
	        frame.setSize(800, 600);
	        lblNewLabel_1.setIcon(icon);
	}
	

	public void actionPerformed(java.awt.event.ActionEvent e) {
        login(e);
              
	}

	private void login(ActionEvent e){
		if (e.getSource() == btnIngresar || e.getSource() == txt2 || e.getSource() == txt1) {
			userText = txt1.getText();
			pwdText = txt2.getText();
                        stm = "select `IDU` from `usuario` where `Usuario` = '"+ userText +"' and `UClave` = '"+ pwdText +"';";
                        System.out.println(stm + userText + pwdText);
                                              
			  if (respuesta.QueryUsuario(stm) != 0 ) {
                                cache.escribirCache(respuesta.QueryUsuario(stm));
				JOptionPane.showMessageDialog(this, "Login con exito");
			   
						VentanaPrivacidad uno = new VentanaPrivacidad();
						dispose();
						
				   }else{
					   if(userText.isEmpty()&& pwdText.isEmpty() ){
					 JOptionPane.showMessageDialog(null, "Campos vacios", "ERROR :(", JOptionPane.INFORMATION_MESSAGE);
					
			   
					}else {
					 JOptionPane.showMessageDialog(this, "Usuario o contrasena incorrecta", "INCORRECTO >:(", JOptionPane.INFORMATION_MESSAGE);
				  }
						
			  }
			}if (e.getSource() == btnSalir){  
		   
			 System.exit(WIDTH);
			}                               
	}
	private void txt2ActionPerformed(java.awt.event.ActionEvent evt){
		login(evt);
	}
	
	private void txt1ActionPerformed(java.awt.event.ActionEvent evt){
		login(evt);
	}
}

