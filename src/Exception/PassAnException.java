package Exception;

import java.util.*;
import java.text.SimpleDateFormat;

public class PassAnException { // Clase principal del programa

    static void convertDateFormat(String inputDate) {
        // Método que recibe una fecha en texto y la cambia de formato

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            // Define el formato en el que el usuario debe escribir la fecha

            Date date = sdf.parse(inputDate);
            // Convierte el texto ingresado a una fecha real

            SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd");
            // Define el nuevo formato al que se quiere cambiar la fecha

            String outputDate = outputsdf.format(date);
            // Convierte la fecha al nuevo formato (ahora como texto otra vez)

            System.out.println("After changing date format to yyyy/MM/dd : " + outputDate);
            // Muestra la fecha ya convertida
        }
        catch(java.text.ParseException e){
            // Si el usuario escribe mal la fecha, entra aquí

            System.out.println("Some error occurred while converting date formats. Exception");
            // Mensaje simple de error
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Permite leer lo que escribe el usuario

        System.out.println("Enter date in dd/MM/yyyy format: ");
        // Le pide al usuario una fecha

        String inputDate = scanner.nextLine();
        // Guarda lo que el usuario escribió

        convertDateFormat(inputDate);
        // Llama al método para convertir la fecha
    }
}