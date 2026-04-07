package StringsandMethods;

public class StringFormatting {
	public static void main (String [] args) {
		
		String input = "Hello %s";

		String output1 = input.formatted("World");
		System.out.println(output1);

		String output2 = input.formatted("Jakob");
		System.out.println(output2);
	}
}
