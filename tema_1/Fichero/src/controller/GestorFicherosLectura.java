package controller;

import java.io.*;

public class GestorFicherosLectura {

    public void lecturaDirectorios(String path) {
        File file = new File(path);
        String[] nombre = file.list();
        File[] fichero = file.listFiles();
        for (File item : fichero) { // para filtrar archivos ocultos
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

    public void lecturaSubdirectorios(String path) {
        File file = new File(path);

        if (file.isDirectory()) {
            for (File subFile : file.listFiles()) {
                System.out.println("\t" + subFile.getName());
                lecturaSubdirectorios(subFile.getAbsolutePath());
            }
        }
    }

    public void lecturaTextoPlano(String path) {
        File file = new File(path);
        //FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        if (file.exists() && file.isFile()) {
            //existe y además es un fichero
            //trato la excepción
            try {
                //fileReader = new FileReader(file);
                //creamos un elemento tipo file reader dentro de la variable
                bufferedReader = new BufferedReader(new FileReader(file));

                /*int lectura = 0;
                //para leer toda la línea hacemos un while ((lectura = fileReader.read()) != -1) {
                    //esta en ASCII y los pasamos a char leer carácter a caracter
                    System.out.print((char) lectura);
                }*/
                String lectura ;
                //ocupa más espacio, pero es multihilo
                //StringBuffer lecturaCompleta=new StringBuffer();
                //este ocupa menos espacio pero no es multihilo
                StringBuilder lecturaCompleta=new StringBuilder();
                while ((lectura = bufferedReader.readLine()) != null) {
                    lecturaCompleta.append(lectura);
                    lecturaCompleta.append("\n");

                }
                System.out.println(lecturaCompleta);
                //excepcion más específica
            } catch (FileNotFoundException e) {
                System.out.println("Fallo en la lectura del fichero");
                System.out.println(e.getMessage());
                //excepción más generica
            } catch (IOException e) {
                System.out.println("Error en la escritura fallo de permisos");
            } finally {
                //se ejecuta si o si
                try {
                    //  fileReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error en el cerrado de flujo");
                } catch (NullPointerException e) {
                    System.out.println("Error en el cerrado por ser nulo");
                }

            }
        }

    }



}





