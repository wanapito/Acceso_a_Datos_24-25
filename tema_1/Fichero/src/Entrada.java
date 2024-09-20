import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        // file -> fichero lógico ->físico
        // se crea un tipo file con ruta absoluta
        //File ficheroSinPuntero=new File("D:\\intellij\\Acceso_a_Datos_24-25\\tema_1\\Fichero\\src\\resources\\directorio\\ejemplo_fichero.txt");
        // se crea un tipo file con ruta relativa
        File ficheroSinPuntero = new File("src/resources/directorio");
        // se solicitan valores de tipo file
        System.out.println(ficheroSinPuntero.getName());
        System.out.println(ficheroSinPuntero.getParent());
        System.out.println(ficheroSinPuntero.length());
        System.out.println(ficheroSinPuntero.exists());
        System.out.println(ficheroSinPuntero.isDirectory());
        System.out.println(ficheroSinPuntero.isFile());
        //pedimos array de fichero dentro del directorio
       ficheroSinPuntero.listFiles();
        // pedimos array de rutas de fichero dentro de directorio
        ficheroSinPuntero.list();

        // pedimos
//si el fichero existe no se crea
        if (!ficheroSinPuntero.exists()) {
            //se crea excepción por si hay problema de escritura
                    try {
                ficheroSinPuntero.createNewFile();
            } catch (IOException e) {
                System.out.println("fallo en la creación del fichero");
            }

        }
    }
}
