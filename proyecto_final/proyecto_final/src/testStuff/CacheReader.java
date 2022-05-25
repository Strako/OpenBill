package testStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Scanner;

public class CacheReader {

    public int leerCache() throws FileNotFoundException, IOException {
        int resultado = 0;
        try {
            //Lectura Cache
            File cacheObj = new File("Cache.temp");
            Scanner cacheReader = new Scanner(cacheObj);
            while (cacheReader.hasNextLine()) {
                String data = cacheReader.nextLine();
                System.out.println("Cache Base64: " + data);
                try {
                    //Decodificacion base64 del cache y retorno del valor en tipo int
                    byte[] decodedBytes = Base64.getDecoder().decode(data);
                    String decodedString = new String(decodedBytes);
                    resultado = Integer.valueOf(decodedString);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            cacheReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ah ocurrido un error.");
            e.printStackTrace();
        }
        return resultado;
    }
}
