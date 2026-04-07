package StringsandMethods;

public class ReplacingCharactersinStringsWithreplace {
	public static void main(String[] args) {

        // replace()
        String source = "123abc";
        String replaced = source.replace('a', '@');

        System.out.println("replace:");
        System.out.println(replaced);

        // replaceFirst()
        String text = "one two three two one";
        String first = text.replaceFirst("two", "five");

        System.out.println("\nreplaceFirst:");
        System.out.println(first);

        // replaceAll()
        String all = text.replaceAll("two", "five");

        System.out.println("\nreplaceAll:");
        System.out.println(all);
    }
}
