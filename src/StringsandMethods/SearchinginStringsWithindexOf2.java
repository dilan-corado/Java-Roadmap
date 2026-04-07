package StringsandMethods;

public class SearchinginStringsWithindexOf2 {
	public static void main(String[] args) {

        String theString = "is this good or is this bad?";
        String substring = "is";

        int index = theString.indexOf(substring);

        while (index != -1) {
            System.out.println(index);
            index = theString.indexOf(substring, index + 1);
        }
        
        String theString1 = "is this good or is this bad?";
        String substring2 = "is";

        int index1 = theString1.lastIndexOf(substring2);

        System.out.println(index1);
    }

}
