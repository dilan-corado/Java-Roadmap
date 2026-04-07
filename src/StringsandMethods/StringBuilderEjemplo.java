package StringsandMethods;

public class StringBuilderEjemplo {
	public static void main(String[] args) {

        String one = "Hello";
        String two = "World";

        String three = new StringBuilder(one)
                .append(two).toString();

        System.out.println(three);
    }

}
