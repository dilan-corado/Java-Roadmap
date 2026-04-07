package StringsandMethods;

public class TrimmingStringsWithtrim {
	public static void main(String[] args) {

        String text = "   And he ran across the field   ";

        System.out.println("Original:");
        System.out.println(text);

        String trimmed = text.trim();

        System.out.println("\nSin espacios:");
        System.out.println(trimmed);
    }

}
