package org.example;

import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @org.junit.jupiter.api.Test
    void leerArchivo() throws FileNotFoundException {

        String contenido = FileUtils.leerArchivo("C:\\Users\\gruts\\Documents\\hola.txt");

        assertEquals(contenido, "hola");
    }

    @org.junit.jupiter.api.Test
    void crearArchivo() throws IOException {

        File validar= new File("C:\\Users\\gruts\\Documents\\hola2.txt");
        assertTrue(!validar.exists());
        FileUtils.crearArchivo("ESTE SERA EL TEXTO NUEVO",validar.toString());
        assertTrue(validar.exists());
        if (validar.exists()){
            validar.delete();
        }
        assertTrue((!validar.exists()));
    }
}