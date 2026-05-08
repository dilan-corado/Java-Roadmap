package MathOperations;

public class DivisionExample {
    public static void main(String[] args) {
        int division1 = 100 / 10;
        int division2 = division1 / 2;
        int division3 = division1 / division2;

        int division = 100 / 10 / 2;
        int divisionWithParentheses = 100 / (10 / 2);

        int result = 100;
        result /= 5;

        System.out.println("division1 = " + division1);
        System.out.println("division2 = " + division2);
        System.out.println("division3 = " + division3);
        System.out.println("division = " + division);
        System.out.println("divisionWithParentheses = " + divisionWithParentheses);
        System.out.println("result = " + result);
    }
}