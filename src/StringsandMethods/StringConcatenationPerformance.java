package StringsandMethods;

public class StringConcatenationPerformance {

	    public static void main(String[] args) {

	        String[] strings =
	                new String[]{"one", "two", "three", "four", "five"};

	        String result = "";

	        for (String string : strings) {
	            result = result + string;
	        }

	        System.out.println(result);
	    }
	}

