package calculadora.ejercicio.domains;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LectorArchivo {

    public static double leerNumeroDesdeArchivo(String rutaArchivo) throws FileNotFoundException {
        if (!Files.exists(Paths.get(rutaArchivo))) {
            throw new FileNotFoundException("El archivo no existe en la ruta especificada: " + rutaArchivo);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea = bufferedReader.readLine();
            System.out.println("Ruta del archivo: " + rutaArchivo + " y la linea es " + linea);
            return Double.parseDouble(linea);
        } catch (IOException e) {
            throw new FileNotFoundException("No se pudo encontrar el archivo");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El archivo no contiene un número válido.");
        }
    }

    public static String leerContenidoDelArchivo(String rutaArchivo) throws IOException {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        }
        return contenido.toString();
    }
}
