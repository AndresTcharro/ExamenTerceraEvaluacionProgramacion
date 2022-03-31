
   
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniterminal;

/**
 *
 * @author DAW
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/**
 *
 * @author DAW
 */
public class MiniFileManager {

    File rutaActual = new File("");
//Constructor 
    public MiniFileManager(File ruta) {
        this.rutaActual = ruta;
    }
//Getters & Setters
    public File getRuta() {
        return rutaActual;
    }

    public void setRuta(File ruta) {
        this.rutaActual = ruta;
    }
// Método para que te la ruta completa en la que estamos 
    public String getPWD() throws IOException {

        String ruta = this.rutaActual.getAbsolutePath();//creamos un Srint de ruta a la cual le metemos ruta que hemos creado 
        System.out.println(ruta);
        return ruta;
    }
//Método para que que nos movamos de directorio.
    public boolean changeDir(String ruta) throws FileNotFoundException {
        File nuevaruta = new File("C:\\Users\\DAW\\Desktop\\EjercioA3\\Libros");
        if (!nuevaruta.exists()) {
            throw new FileNotFoundException();
        }
        rutaActual = nuevaruta;
        System.out.println("Se ha cambiado de directorio");
        return true;
    }

 //Método para imprimir la lista de directorios y archivos de la carpeta actual 
    public boolean printList(boolean info) throws FileNotFoundException { //Creamos esta función para listar la lista de "rutaActual"
        try {
            String ruta = rutaActual.getAbsolutePath();// creamos "ruta" para almacenar la "rutaActual"
            System.out.println(ruta);
            File carpeta = new File(ruta); //Creamos un objeto "carpeta" en el cual almacenamos "ruta"
            if (!carpeta.exists()) { //Comprobamos que exista el File "carpeta" si no existe mandamos un Exception 
                throw new FileNotFoundException();
            }
            if (carpeta.isFile()) {   //Si la el objeto "carpeta"  es un File le decimos que lo imprima y nos muestre el nombre
                System.out.println("" + carpeta.getName());
            }
             if (carpeta.isDirectory()) {   //Por otra parte si es un Directory  
                System.out.println("Nombre del directorio donde nos encontramos: " + carpeta.getName()); 
                for (File ruta2 : carpeta.listFiles()) {  //Creamos  "ruta2" para almacenar la lista de las carpetas dentro del Directorio en el que nos encontramos 
                    if (ruta2.isDirectory()) {
                        System.out.println("Directorio: " + ruta2.getName());//Imprimimos los nombres de los directorios 
                    }

                }
               for (File ruta3 : carpeta.listFiles()) {   //Creamos "ruta" para almacenar la lista de los ficheros que que tenemos dentro de "ruta" 
                    if (ruta3.isFile()) {
                        System.out.println("Fichero: " + ruta3.getName());//Imprimimos los ficheros con su nombre.
                    }

                }
             }
            
        }catch (Exception e) {
         System.out.println("No hay elemenmtos dentro de la ruta actual");  }
        return true;
    }

    public boolean printListTamñoFecha (boolean info) throws FileNotFoundException{
            String ruta = rutaActual.getAbsolutePath();
            System.out.println(ruta);
            File carpeta = new File (ruta);
            return true;
    }

}


/**public boolean changeDir (String dir) {
   try  {
       File rutaActual = new File();
       
   }catch{
   }
   
}
    
}
    
    /*archivos = carpeta.listFiles(filtro);
if (archivos == null || archivos.length == 0) {
    System.out.println("No hay elementos dentro de la carpeta actual");
    return;
}
else {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    for (int i=0; i< archivos.length; i++) {
        File archivo = archivos[i];
        System.out.println(String.format("%s (%s) - %d - %s", 
                        archivo.getName(),
                        archivo.isDirectory() ? "Carpeta" : "Archivo",
                        archivo.length(),
                        sdf.format(archivo.lastModified())
                ));
    }
}
    return ;
}
    
}*/
