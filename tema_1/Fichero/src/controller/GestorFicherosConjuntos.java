package controller;

import java.io.*;
import java.util.Scanner;

public class GestorFicherosConjuntos {
    public void lecturaEscritura(String path) {
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        //System.out.println("Por favor introduce el texto que quieres guardar");
        String escritura = "este es el examen que hay que descrifrar";
        BufferedReader bufferedReader = null;

        try {
            // fileWriter=new FileWriter(file, false);
            fileWriter = new FileWriter(file, true);

            for (int i = 0; i < escritura.length(); i++) {
                char letra = escritura.charAt(i);
                int codigo = (int) letra;
                fileWriter.write(String.valueOf(codigo * 5 + "\n"));
            }
            fileReader = new FileReader(file);
            int codigoLectura;
            while ((codigoLectura = fileReader.read()) != -1){

            System.out.println((char) codigoLectura);}

            // bufferedReader=new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("archivo no se encuentra");
        } catch (IOException e) {
            System.out.println("error en los permisos");
        } finally {
            try {
                fileWriter.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("error de escritura");
            }




        }
    }
    }
