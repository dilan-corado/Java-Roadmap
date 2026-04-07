package StringsandMethods;

public class TranslateEscapeCodes {
	public static void main(String[]args) {
		String input = "Hey, \\n This is not normally a line break.";
		System.out.println(input);

		String output = input.translateEscapes();
		System.out.println(output);
	}
}
