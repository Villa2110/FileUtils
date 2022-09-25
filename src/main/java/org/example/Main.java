package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\gruts\\Documents\\fileExample.txt";
        FileUtils.leerArchivo(path);

        Scanner x=new Scanner(System.in);

        System.out.println("\n Por favor ingrese el texto que se almacenara en el archivo de Texto nuevo");
        String path2="C:\\Users\\gruts\\Documents\\fileExample2.txt";
        String texto=x.nextLine();

        FileUtils.crearArchivo(texto,path2);
    }
}