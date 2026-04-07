package StringsandMethods;

public class Matches {
	public static void main(String[] args) {

        String text = "one two three two one";

        boolean matches = text.matches(".*two.*");

        System.out.println(matches);
    }
}
