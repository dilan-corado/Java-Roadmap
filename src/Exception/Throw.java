package Exception;

public class Throw { //palabra clave para lanzar una excepcion 
	static void avg()
	{
		try {
			throw new ArithmeticException("Demo"); //excepcion
		}
		catch (ArithmeticException e) //capturar
		{
			System.out.println("Exception caught");
		}
	}
	public static void main (String args []) // llamando toda la funcion en el metodo main
	{
		avg();
	}
} // la salida es solo una rama , cuando llamamos a la funcion avg en el metodo main vuelve al bucle 
