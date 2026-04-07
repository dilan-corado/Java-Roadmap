package Exception;

public class Finally { //Es un bloque que se utiliza para ejecutar codigos importantes como cerrar el flujo de conexión sin importar si la excepsion se maneja o no, el bloque finally siempre se ejecturá
	public static void main(String args [])
	{
		
	
		 
		 try {
			 int num = Integer.parseInt("Dilan"); 
			 System.out.println(num); 
			 }
		 finally {
			 System.out.println("finally is always executed");
		 }
}
}		//la terminal lanza la excepsion pero el flujo no se interrumpe porque usamos el finally bloque
