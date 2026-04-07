package StringsandMethods;

public class StringLiteralsasConstantsorSingletons {

	public static void main (String [] args) {
		
		String myString1 = "Hello world";
		String myString2 = "Hello world";
		
		  // Comparación con ==
        System.out.println(myString1 == myString2); // true

        // Comparación con equals
        System.out.println(myString1.equals(myString2)); // true
    }
	}
