import controller.GestorFicherosConjuntos;
import controller.GestorFicherosEscritura;
import controller.GestorFicherosLectura;

public class Entrada {
    public static void main(String[] args) {
        GestorFicherosLectura gestorFicheroslectura = new GestorFicherosLectura();
        //gestorFicheroslectura.lecturaDirectorios("src/resources/ficheros");
       // gestorFicheroslectura.lecturaSubdirectorios("D:\\drive ivan\\Curso DAM daw\\UNIR\\2º curso\\Acceso a datos\\repositorios\\AD_2024-2025");
        //gestorFicheroslectura.lecturaTextoPlano("src/resources/ficheros/lectura.txt");
        GestorFicherosEscritura gestorFicherosEscritura = new GestorFicherosEscritura();
        //gestorFicherosEscritura.escribirFicheros("src/resources/ficheros/escritura.txt");
        GestorFicherosConjuntos gestorFicherosConjuntos=new GestorFicherosConjuntos();
        gestorFicherosConjuntos.lecturaEscritura("src/resources/ficheros/lecturaEscritura.txt");
    }
}
