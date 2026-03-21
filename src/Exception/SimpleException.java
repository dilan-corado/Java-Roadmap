package Exception;

public class SimpleException {
	public static void main(String args [])
	{
		
		//String str = null; // cadena STR nula
		//System.out.println(str.length());  // Recuperar la longitud de la cadena
		//Cuando se ejecute el programa lanzará una excepcion porque la cadena es nula y estamos intentando recuperar la longitud de la cadena
		
		//usaremos un try-cath para manejar la excepcion
		 try { // dentro del try code estará la excepcion
			int a=30, b=0;
			int c=a/b;
			System.out.println("result = " +c);
		}
		catch(ArithmeticException e) //Cath para manejar la excepcion y mantener el flujo normal 
		 {
			 System.out.println("Cant divide a number by zero"); // imprime el mensaje, en try surge la excepcion aritmetica y catch la captura y la maneja
		 }
		 
		 try {
			 int num = Integer.parseInt("Dilan"); 
			 System.out.println(num); // excepcion de formato de numero 
			 
		 }
		 catch(NumberFormatException e)
		 {
			 System.out.println("Number format exception"); 
		 }
		 
		 try { 
			 int a [] = new int [5];
			 a[7]=9; // excepcion de indicie de matriz fuera de limites 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Array index out of bounds");
		 }
	}
}

