package Exception;

public class Throws { // tambien es una palabra clave que se usa para declarar las excepciones no lanza ninguna excepcion pero especifica que puede ocurrir cualquier excepcion en el metodo
	static void avg () throws ArithmeticException
	
	{
		System.out.println("Inside avg function");
		throw new ArithmeticException("Demo"); //palabra clave para lanzar la exception aritmetica 
	}
	
	public static void main (String args []) // llamando toda la funcion en el metodo main
	{
		try {
		avg();
		}
		finally 
		{
			System.out.println("Caugth");
		}
	}
}