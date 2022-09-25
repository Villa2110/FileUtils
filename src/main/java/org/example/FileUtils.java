package org.example;

import java.io.*;

public class FileUtils {

    public static void leerArchivo(String path) throws FileNotFoundException {
        FileReader archivo=new FileReader(path);
        try {
            int valor=archivo.read();
            while (valor!=-1){
                System.out.print((char) valor);
                valor=archivo.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void crearArchivo(String texto,String path) throws IOException {
        FileWriter newFile= new FileWriter(path);
        newFile.write(texto);
        newFile.close();
        }
    }
