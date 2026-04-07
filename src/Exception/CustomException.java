package Exception;

import java.util.*;

class CustomException { // Clase principal donde está la lógica

    static void validateInput(int number) throws InvalidInputException {
        // Método que valida el número y puede lanzar una excepción

        if(number > 100) // Si el número es mayor a 100
        {
            throw new InvalidInputException("Exception");  
            // Lanza una excepción personalizada
        }

        System.out.println("Valid Input");  
        // Si no hay error, imprime que el dato es válido
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        // Crea objeto para leer datos del usuario

        System.out.println("Enter a number less than 100 : ");  
        // Mensaje para el usuario

        int number = scanner.nextInt();  
        // Guarda el número ingresado

        try{
            validateInput(number);  
            // Llama al método que valida el número
        }
        catch(InvalidInputException e){
            // Captura la excepción personalizada

            System.out.println("Caught Exception - Input is greater than 100");  
            // Mensaje cuando ocurre el error
        }
    }
}

// Clase de excepción personalizada
class InvalidInputException extends Exception{

    InvalidInputException(String exceptionText){
        super(exceptionText);  
        // Llama al constructor de Exception y guarda el mensaje
    }

}