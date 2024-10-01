import java.io.File;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad_01 {


    public static void main(String[] args){
        //Parte 1: Listar el nombre de todos los ficheros ubicados en un directorio (en clase hemos puesto como ejemplo un directorio creado en el paquete resources)
        File directorio = new File("src/resources/directorio");
        System.out.println(Arrays.toString(directorio.listFiles()));
        //Parte 2: Crear un subdirectorio dentro de la carpeta anterior y listar el nombre de todo los archivos
        File carpeta = new File("src/resources/directorio/carpeta");
        if (!carpeta.exists()){
          System.out.println("carpeta creada"+  carpeta.mkdir());
        }
        else
            System.out.println("la carpeta ya existe");
          System.out.println(Arrays.toString(carpeta.listFiles()));
        File archivo = new File("src/resources/directorio/carpeta/archivo.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("archivo creado" + archivo.getName());
            } else
                System.out.println("el archivo ya existe");
        } catch (IOException e) {
            System.out.println("ha habido un error");
        }
        //Parte 3: Listar el nombre de todos los ficheros y directorios de una ruta concreta,
        // como por ejemplo C:/Users tenéis que utilizar el concepto de recursividad.

        System.out.println("introduce la ruta que quieres listas");
        Scanner teclado = new Scanner(System.in);
        String ruta = teclado.next();
        listarDirectorio(ruta);
    }

    private static void listarDirectorio(String ruta) {
        // Crear un objeto File con la ruta dada
        File directorio = new File(ruta);

        // Obtener todos los ficheros y directorios dentro de la ruta
        File[] archivos = directorio.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                // Imprimir la ruta del archivo o directorio
                System.out.println(archivo.getAbsolutePath());


                // Si es un directorio, llamar recursivamente
                if (archivo.isDirectory()) {
                    listarDirectorio(archivo.getAbsolutePath());
        }
      }
    }
  }
}
