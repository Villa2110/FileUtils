package org.example;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String pathname= JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ARCHIVO A ABRIR");
        String path="C:\\Users\\gruts\\Documents\\" + pathname+".txt";
        FileUtils.leerArchivo(path);

        String texto=JOptionPane.showInputDialog("POR FAVOR INGRESE EL TEXTO DEL NUEVO ARCHIVO");
        String nombre= JOptionPane.showInputDialog("INGRESE EL NOMBRE CON EL " +
                "QUE SE GUARDARA EL NUEVO ARCHIVO");
        String path2="C:\\Users\\gruts\\Documents\\" + nombre + ".txt";

        FileUtils.crearArchivo(texto,path2);
    }
}