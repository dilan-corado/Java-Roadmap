package Exception;

public class ExceptionDefineUser {
	public static void main(String args[])  // Método principal: aquí inicia el programa
	{
	    try {  // Bloque donde se intenta ejecutar código que puede lanzar errores
	        throw new MyException(5);  
	        // Se lanza manualmente una excepción personalizada con valor 5
	    }
	    catch(Exception e)  // Captura cualquier excepción que ocurra
	    {
	        System.out.println(e);  
	        // Imprime la excepción (automáticamente llama al método toString())
	    }
	}
}
	class MyException extends Exception  // Clase personalizada que hereda de Exception
	{
	    int a;  // Variable para guardar un número

	    MyException(int b){  // Constructor que recibe un valor
	        a = b;  // Se asigna el valor recibido a la variable 'a'
	    }

	    public String toString() {  
	        // Método que define cómo se mostrará la excepción al imprimirse
	        return("Exception number = " + a);  
	        // Devuelve el mensaje personalizado con el valor de 'a'
	    }
	}
