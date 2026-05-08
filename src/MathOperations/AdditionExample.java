package MathOperations;

public class AdditionExample {
    public static void main(String[] args) {
        int sum1 = 10 + 20;
        int sum2 = sum1 + 33;
        int sum3 = sum2 + sum2;

        int result = 10;
        result += 20;

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("result = " + result);
    }
}