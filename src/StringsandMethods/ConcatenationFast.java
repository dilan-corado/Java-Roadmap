package StringsandMethods;

public class ConcatenationFast {
	 public static void main(String[] args) {

	        String[] strings =
	                new String[]{"one", "two", "three", "four", "five"};

	        StringBuilder temp = new StringBuilder();

	        for (String string : strings) {
	            temp.append(string);
	        }

	        String result = temp.toString();

	        System.out.println(result);
	    }
	}

