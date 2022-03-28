/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniterminal;

import java.io.File;

/**
 *
 * @author DAW
 */
public class MiniTerminal {
    public static void main(String[] args) {
        //ruta 
        
        File f = new File ("C:\\Users\\DAW\\Desktop\\EjercioA3");
        
      
        System.out.println("El nombre de la ruta es: " + f.getAbsolutePath());
    }
}
