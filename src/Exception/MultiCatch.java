package Exception;

public class MultiCatch { // si tenemos que realizar varias tareas cuando ocurren varias excepciones entonces podemos usar el multicatch 
	public static void main(String args [])
	{
		
	
		 
		 try {
			 int num = Integer.parseInt("Dilan"); 
			 System.out.println(num); 
			 
		 }
		 catch(NumberFormatException e)
		 {
			 System.out.println("Number format exception"); 
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Handled");
		 }
		 
		 System.out.println("Other statement");
		  
		 }
		
		 // imprimira la excepcion del formato de numero y luego imprimio otra declaracion
	}



