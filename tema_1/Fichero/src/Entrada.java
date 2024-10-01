import controller.GestorFicheros;

public class Entrada {
    public static void main(String[] args) {
        GestorFicheros gestorFicheros = new GestorFicheros();
        //gestorFicheros.lecturaDirectorios("src/resources/ficheros");
       gestorFicheros.lecturaSubdirectorios("D:\\drive ivan\\Curso DAM daw\\UNIR\\2º curso\\Acceso a datos\\repositorios\\AD_2024-2025");
        //gestorFicheros.lecturaTextoPlano("src/resources/ficheros/lectura.txt");
    }
}
