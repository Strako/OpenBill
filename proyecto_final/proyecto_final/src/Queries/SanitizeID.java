/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queries;

/**
 *
 * @author Desk-strako
 */
public class SanitizeID {
    
    public int extraerID (String cliente){
        String textoID = "";
        int resultado = 0;
        for (int i = 0; i < cliente.length(); i++) {
            if (!String.valueOf(cliente.charAt(i)).equalsIgnoreCase("-")) {       
                textoID = textoID + String.valueOf(cliente.charAt(i));  
            } else{
                i = cliente.length(); 
                
            }           
        }
        resultado = Integer.valueOf(textoID);
        return resultado;
    }
    
   /* 
        public static void main(String[] args){
        SanitizeID sanitizar = new SanitizeID();
        FindPrecio precio = new FindPrecio();
        System.out.println(precio.obetenerPrecio(sanitizar.extraerID("2-lol")));

    }
*/  
}
