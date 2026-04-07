package StringsandMethods;

public class ComparingStrings {
	    public static void main(String[] args) {

	        String one = "abc";
	        String two = "def";
	        String three = "abc";
	        String four = "ABC";

	        // equals()
	        System.out.println("equals:");
	        System.out.println(one.equals(two));   // false
	        System.out.println(one.equals(three)); // true
	        System.out.println(one.equals(four));  // false

	        // equalsIgnoreCase()
	        System.out.println("\nequalsIgnoreCase:");
	        System.out.println(one.equalsIgnoreCase(four)); // true

	        // startsWith() y endsWith()
	        String text = "This is a good day to code";

	        System.out.println("\nstartsWith:");
	        System.out.println(text.startsWith("This")); // true
	        System.out.println(text.startsWith("This", 5)); // false

	        System.out.println("\nendsWith:");
	        System.out.println(text.endsWith("code"));   // true
	        System.out.println(text.endsWith("shower")); // false

	        // compareTo()
	        System.out.println("\ncompareTo:");
	        System.out.println(one.compareTo(two));   // negativo
	        System.out.println(one.compareTo("abd")); // negativo
	    }
	}

