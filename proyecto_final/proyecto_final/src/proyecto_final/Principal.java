package proyecto_final;

import proyecto_final.InicioSesion;
import java.awt.EventQueue;
import proyecto_final.InicioSesion;

public class Principal {
    	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
}
