package StringsandMethods;

public class JavaTextBlockIndentation {
	 public static void main(String[] args) {

	        String textblock1 = """
	                This is a Java text block
	                """;

	        String textblock2 = """ 
	                  This is a Java text block    
	                """;

	        String textblock3 = """
	                        This is a Java text block
	                """;

	        System.out.println(textblock1);
	        System.out.println(textblock2);
	        System.out.println(textblock3);
	    }
}
