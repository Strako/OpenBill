/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queries;

/**
 *
 * @author Desk-strako
 */
public class FindPrecio {
    QPRPrecio qPrecio = new QPRPrecio();
    
    public  float obetenerPrecio (int producto){
        float resultado;
        String stmPrecio = "select `PRPrecio` from `productos` where `IDPR` = "+ producto +";";
        resultado = qPrecio.QueryUsuario(stmPrecio);
        
        return resultado;
    }        
}
