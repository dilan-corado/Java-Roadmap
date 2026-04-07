package StringsandMethods;

public class SplittingStringsWithsplit {
	public static void main(String[] args) {

        String source = "A man drove with a car.";

        // split normal
        String[] parts = source.split("a");

        System.out.println("Sin limit:");
        for (String p : parts) {
            System.out.println(p);
        }

        // split con limit = 2
        String[] parts2 = source.split("a", 2);

        System.out.println("\nCon limit = 2:");
        for (String p : parts2) {
            System.out.println(p);
        }

        // split con limit = 3
        String[] parts3 = source.split("a", 3);

        System.out.println("\nCon limit = 3:");
        for (String p : parts3) {
            System.out.println(p);
        }
}
}