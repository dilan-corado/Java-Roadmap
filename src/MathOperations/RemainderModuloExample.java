package MathOperations;

public class RemainderModuloExample {
    public static void main(String[] args) {
        int value = 100;
        int remainder = value % 9;

        int result = 100;
        result %= 9;

        System.out.println("remainder = " + remainder);
        System.out.println("result = " + result);
    }
}