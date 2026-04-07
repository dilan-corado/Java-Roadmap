package Exception;

public class TryAninadado {
	public static void main(String args [])
	{
		
		 try { 
			int a=30, b=0;
			int c=a/b;
			System.out.println("result = " +c);
		}
		catch(ArithmeticException e) 
		 {
			 System.out.println("Cant divide a number by zero"); 
		 }
		 
		 try {
			 try { // try put it try , hay dos try bloques 
			 int num = Integer.parseInt("Dilan"); 
			 System.out.println(num); 
			 
		 }
		 catch(NumberFormatException e)
		 {
			 System.out.println("Number format exception"); 
		 }
		 
		 try { 
			 int a [] = new int [5];
			 a[7]=9; 
		 } 
		 catch(Exception e)
		 {
			 System.out.println("Handled");
		 }
		 
		 System.out.println("Other statement");
		 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Handled and recovered");
		 }
	}
}

