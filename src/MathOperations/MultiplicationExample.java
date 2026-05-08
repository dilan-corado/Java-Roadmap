package MathOperations;

public class MultiplicationExample {
    public static void main(String[] args) {
        int prod1 = 10 * 20;
        int prod2 = prod1 * 5;
        int prod3 = prod1 * prod2;

        int prod = 10 * 20 * 30;

        int result = 10;
        result *= 20;

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod = " + prod);
        System.out.println("result = " + result);
    }
}