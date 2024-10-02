package controller;

import java.io.*;
import java.util.Scanner;

public class GestorFicherosEscritura {
    public void escribirFicheros(String path) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter=null;
        //System.out.println("cuál es el nombre del archivo que quieres guardar");
        //String nombre = scanner.next();
        //File file1 = new File( path+nombre+"txt");
        //System.out.println("Por favor introduce lo que quieres guardar");
        //String lectura = scanner.next();
        //System.out.println("indica si quieres sobreescribir el fichero ");
        // boolean sobrescritura = scanner.nextBoolean();
        //PrintWriter printWriter = null;
// con false pisamos texto con true seguimos por donde se quedo
        try {
            fileWriter = new FileWriter(file, true);
            printWriter=new PrintWriter(file);
            printWriter.println("con print en otra linea");
           // bufferedWriter = new BufferedWriter(fileWriter);

            //  fileWriter.write("\n Yo muy bien");
            //  fileWriter.write("\n" + lectura);
           // bufferedWriter.newLine();
            //bufferedWriter.write("con buffer");
        } catch (IOException e) {
            System.out.println("Error de escritura por permisos");
        } finally {
            printWriter.close();
            // bufferedWriter.close();
            //fileWriter.close();

        }



    }
}


