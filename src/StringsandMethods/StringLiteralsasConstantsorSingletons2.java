package StringsandMethods;

public class StringLiteralsasConstantsorSingletons2 {
	
	public static void main (String [] args) {
		
		String myString1 = new String ("Hello Wolrd");
		String myString2 = new String ("Hello World");
		
		// Comparación con ==
        System.out.println(myString1 == myString2); // false

        // Comparación con equals
        System.out.println(myString1.equals(myString2)); // true
	}
}
