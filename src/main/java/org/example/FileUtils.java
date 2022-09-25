package org.example;

import javax.swing.*;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class FileUtils {

    public static void leerArchivo(String path) throws FileNotFoundException {
       File validar=new File(path);
       if (validar.exists()){
           try {
               FileReader archivo=new FileReader(path);
               int valor=archivo.read();
               while (valor!=-1){
                   System.out.print((char) valor);
                   System.lineSeparator();
                   valor=archivo.read();
               }
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       } else System.out.println("Este archivo no existe");

    }

    public static void crearArchivo(String texto,String path) throws IOException {
        File validar=new File(path);
       if (!validar.isFile()) {
           FileWriter newFile= new FileWriter(path);
           newFile.write(texto);
           newFile.close();
       } else {
           JOptionPane.showMessageDialog(null,"Este archivo ya existe!!");
       }
        }
    }
