package StringsandMethods;

public class ConvertingtoUppercaseandLowercase {
	public static void main (String [] args) {
	String theString = "This IS a mix of UPPERcase and lowerCASE";

	String uppercase = theString.toUpperCase();
	String lowercase = theString.toLowerCase();

	System.out.println(uppercase);
	System.out.println(lowercase);
}
}
