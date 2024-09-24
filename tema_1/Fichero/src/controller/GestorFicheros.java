package controller;

import java.io.File;

public class GestorFicheros {

    public void lecturaDirectorios(String path) {
        File file = new File(path);
        String[] nombre = file.list();
        File[] fichero = file.listFiles();
        for (File item : fichero) {
            // para filtrar archivos ocultos
            if (!item.isHidden()) {
                System.out.println(item.getName());
                //décimos que si es un directorio genere un array nuevo
                if (item.isDirectory()) {
                    File[] subdirectorio = item.listFiles();
                    for (File item2 : subdirectorio) {
                        //"\t" tabula
                        System.out.println("\t" + item2.getName());

                    }
                }
            }
        }
    }

    public void lecturaRecursiva(String path) {
        File file = new File(path);
        for (File item : file.listFiles()) {
            System.out.println(item.getName());
            if (item.isDirectory()) {
                lecturaSubdirectorios(item);
            }
        }
    }

    private void lecturaSubdirectorios(File fichero) {
        for (File item : fichero.listFiles()) {
            System.out.println("\t" + item.getName());
            if (item.isDirectory()) {
                lecturaSubdirectorios(item);

            }
        }
    }
}





