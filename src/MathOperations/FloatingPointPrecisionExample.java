package MathOperations;

public class FloatingPointPrecisionExample {
    public static void main(String[] args) {
        double resultDbl3 = 0D;

        System.out.println("resultDbl3 = " + resultDbl3);

        for (int i = 0; i < 100; i++) {
            resultDbl3 += 0.01D;
        }

        System.out.println("resultDbl3 = " + resultDbl3);
    }
}