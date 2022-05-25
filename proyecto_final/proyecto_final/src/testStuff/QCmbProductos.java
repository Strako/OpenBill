package testStuff;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashMap;

public class QCmbProductos {

    public static void main(String[] args) throws IOException {
//      Lee cache para alamecenar el usuario activo 
        CacheReader lectorCache = new CacheReader();
        String stmA;

        int ID =  lectorCache.leerCache();

        stmA = "select `PRNombre`, `IDPR` from `usuario`, `proveedores`, `productos`, `proveedor_producto`, `usuario_proveedor`  where `IDU` = " + ID + " and `IDUPUsuario` = `IDU` and `IDPV` = `IDUPProveedor` and `IDPV` = `IDPPProveedor` and `IDPR` = `IDPPProducto`;";
        comboBox comboVentana = new comboBox(stmA);
        comboVentana.setVisible(true);
//      Escribe el usuario activo en cache para posterior uso
        
/*
        CacheWriter pruebaCache = new CacheWriter();
        pruebaCache.escribirCache(ID);
*/  
/*
--------------------------------------------------------------
//      CREAR UNA CLASE SOLO PARA POPULAR EL COMBO BOX
/*        
        //Dumpear consulta en un array y popular el comboBox     
//Dump inicio
        QProductos uno = new QProductos();
        String tres[] = new String[uno.run(stmArgs).size()];
        for (int i = 0; i < tres.length; i++) {
            tres[i] = (String) uno.run(stmArgs).get(i + 1);
        }
        for (int i = 0; i < tres.length; i++) {
            comboTest.addItem(tres[i]);

        }
    }
//Dump end
----------------------------------------------------------------
*/   



// DEPRECATED --------------------------------------------------
        /*       
        QProductos uno = new QProductos();
        String tres[] = new String[uno.QueryProducto(1).size()];
        for (int i = 0; i < tres.length; i++) {
            tres[i] = (String) uno.QueryProducto(1).get(i + 1);
        }
        for (int i = 0; i < tres.length; i++) {
            System.out.println(tres[i]);

        }
 // END DEPRECATED ----------------------------------------------
         */

           
    }
}
