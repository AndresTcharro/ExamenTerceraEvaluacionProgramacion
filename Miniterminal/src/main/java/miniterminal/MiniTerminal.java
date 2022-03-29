/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniterminal;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class MiniTerminal {

    public static void main(String[] args) {
        //ruta 

        Scanner entrada = new Scanner(System.in);
        //File ruta = new File("C:\\Users\\DAW\\Desktop\\EjercioA3");
        MiniFileManager r = new MiniFileManager("C:\\Users\\DAW\\Desktop\\EjercioA3");
        File ruta = new File("C:\\Users\\DAW\\Desktop\\EjercioA3");
        boolean salir = false;
        int menu;

        System.out.println("Bienvenido al MINITERMINAL");

        while (!salir) {

            System.out.println("Seleccione una opción");
            System.out.println("     1. PWD, para mostrar la carpeta actual");
            System.out.println("     2. CD<DIR>, cambiar la carpeta actual a a DIR Con .. Cambia la la carpeta superior");
            System.out.println("     3. ls");
            System.out.println("     4. ll");
            System.out.println("     5. mkdir<DIR>");
            System.out.println("     6. rm<FILE>");
            System.out.println("     7. MV<FILE><FILE2>");
            System.out.println("     8. help");
            System.out.println("     9. exit");

            menu = entrada.nextInt();

            switch (menu) {
                case 1:

                    System.out.println("A elegido 1.PWD para visualizar en que carpeta esta");

                    ruta
                   
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Movimientos");
                    break;
                case 8:
                    System.out.println("Movimientos");
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("--------------------------------------------");
                    System.out.println("       Soloopciones entre 1 y 8");
                    System.out.println("--------------------------------------------");
            }
        }
    }
}
