package org.example;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileUtils {

    public static String leerArchivo(String path) throws FileNotFoundException {
       File validar=new File(path);
        Scanner x=new Scanner(validar);
        String contenido="";

        while (x.hasNextLine()){
            System.out.println(contenido=x.nextLine());
        }

return contenido;
    }

    public static void crearArchivo(String texto,String path) throws IOException {
        File validar=new File(path);
        String nombreArchivo="";
       if (!validar.isFile()) {
           FileWriter newFile= new FileWriter(path);
           newFile.write(texto);
           newFile.close();
       } else {
           JOptionPane.showMessageDialog(null,"Este archivo ya existe!!");
       }
        }
    }
