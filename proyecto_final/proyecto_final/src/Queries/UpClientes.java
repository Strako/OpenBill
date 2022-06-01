package Queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class UpClientes extends Thread {

    int resultado;
    int lastId;

    public int updateClientes(String stmArg) {
        try {
            // Se especifica el driver a usar
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // Manejo excepciones
        }

        Connection conn = null;
        String Query = null;

//          Conexion base de datos puerto 3306
        try {
            conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3496880?" + "user=sql3496880&password=fNr5lbf7ES");
//          Definicion declaracion y resultado
            Statement stmt = null;
            ResultSet rs = null;
//          System.out.println("conecto");

            try {
                stmt = conn.createStatement();
                lastId = stmt.executeUpdate(stmArg, Statement.RETURN_GENERATED_KEYS);

            } catch (SQLException ex) {
//              Manejo de errores
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
//              cerrar conexiones y libera recursos

                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException sqlEx) {
                    } // ignore

                    rs = null;
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException sqlEx) {
                    } // ignore

                    stmt = null;
                }
            }

        } catch (SQLException ex) {
//          Manejo de errores
            System.out.println(ex);
        }
        return lastId;
    }

    public int run(String stmArg) {
        try {
         return   updateClientes(stmArg);
            
        } catch (Exception e) {
            System.out.println(e);

        }
        return 0;

    }
}
