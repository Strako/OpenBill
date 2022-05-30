package Queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class QPRPrecio extends Thread {
    float resultado;
    public float QueryUsuario(String stmArg) {
        try {
            // Se especifica el driver a usar
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // Manejo excepciones
        }

        Connection conn = null;
        String Query = null;
        HashMap<Integer, String> qResults = new HashMap<>();
//          Conexion base de datos puerto 3306
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openbill?" + "user=root&password=");
//          Definicion declaracion y resultado
            Statement stmt = null;
            ResultSet rs = null;
            int aux = 0;
//          System.out.println("conecto");

            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(stmArg);
                while (rs.next() != false) {
                    aux++;
//                  System.out.print(rs.getRow() + "---");
                    qResults.put(aux, String.valueOf(rs.getFloat(1)));
//                  System.out.println(qResults.get(aux));
                }
//              Reset valor auxiliar             
                aux = 0;

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
//      Retorna los resultados de la consulta almacenados en un HashMap 'qResults'
//        System.out.println(qResults); 
        try{
        resultado = Float.valueOf(qResults.get(1));
        }catch(Exception e){
            System.out.println(e);
        }
//        System.out.println(resultado);
        return resultado;

    }

    public float run(String stmArg) {
        try {
            return QueryUsuario(stmArg);
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}
