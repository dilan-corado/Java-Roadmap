package StringsandMethods;
import java.nio.charset.Charset;
public class GettingCharactersandBytes {
	public static void main(String[] args) {

        String theString = "This is a good day to code";

        // charAt()
        System.out.println("Caracteres:");
        System.out.println(theString.charAt(0));
        System.out.println(theString.charAt(3));

        // getBytes()
        byte[] bytes1 = theString.getBytes();
        byte[] bytes2 = theString.getBytes(Charset.forName("UTF-8"));

        System.out.println("\nBytes (default):");
        for (byte b : bytes1) {
            System.out.print(b + " ");
        }

        System.out.println("\n\nBytes (UTF-8):");
        for (byte b : bytes2) {
            System.out.print(b + " ");
        }
    }
}
