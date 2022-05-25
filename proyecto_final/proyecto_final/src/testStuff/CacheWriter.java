package testStuff;

import java.io.*;
import java.util.Base64;

public class CacheWriter {

    public void escribirCache(int ID) {
        try {

            FileWriter miCache = new FileWriter("Cache.temp");
            miCache.write(Base64.getEncoder().encodeToString(String.valueOf(ID).getBytes()));
            miCache.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
