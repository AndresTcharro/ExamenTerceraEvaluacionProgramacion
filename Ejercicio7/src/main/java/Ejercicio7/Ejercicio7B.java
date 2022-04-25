/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio7B {

    
    public static void main(String[] args) {
        
        int lineas=0;
        int palabras=0;
        int caracteres=0;
       LinkedList<File> listaFicheros = new LinkedList<>();
       for (int i = 0; i< listaFicheros.size(); i++){
           listaFicheros.add(new File)("C:\\Users\\DAW\\Desktop\\Documentos\\Libros\\coplas_manrique.txt");
       }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* public static void main(String[] args) throws FileNotFoundException, IOException {
      
       int contador = 0;
        try {
        FileReader f = new FileReader("C:\\Users\\DAW\\Desktop\\Documentos\\Libros\\coplas_manrique.txt");

            try (BufferedReader bf = new BufferedReader(f)) {
               //System.out.println("El fichero tiene  " + bf.lines().count() + " lineas");
               String linea = bf.readLine();
               while(linea != null){
                   String [] palabras = linea.split("");
                   contador += palabras.length;
                   linea = bf.readLine();
                   
               }
           }
          
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nPalabras contadas: " +contador);
        
    }*/
}
