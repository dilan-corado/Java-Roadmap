package StringsandMethods;

public class StripIndentation {
	public static void main(String[]args) {
		String input = "   Hey\n   This\n   is\n   indented.";

		String output = input.stripIndent();

		System.out.println(output);
	}
}
