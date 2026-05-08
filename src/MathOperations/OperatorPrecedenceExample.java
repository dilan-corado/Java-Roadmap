package MathOperations;

public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int result1 = 100 * 100 / 5 + 200 * 3 / 2;
        int result2 = 100 * 100 / (5 + 200) * 3 / 2;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}