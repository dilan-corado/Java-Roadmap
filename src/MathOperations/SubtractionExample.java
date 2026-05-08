package MathOperations;

public class SubtractionExample {
    public static void main(String[] args) {
        int diff1 = 200 - 10;
        int diff2 = diff1 - 5;
        int diff3 = diff1 - diff2;

        int diff = 200 - (-10);

        int result = 200;
        result -= 10;

        System.out.println("diff1 = " + diff1);
        System.out.println("diff2 = " + diff2);
        System.out.println("diff3 = " + diff3);
        System.out.println("diff = " + diff);
        System.out.println("result = " + result);
    }
}