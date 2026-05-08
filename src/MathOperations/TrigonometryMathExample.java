package MathOperations;

public class TrigonometryMathExample {
    public static void main(String[] args) {
        double sin = Math.sin(Math.PI);
        double cos = Math.cos(Math.PI);
        double tan = Math.tan(Math.PI);

        double asin = Math.asin(1.0);
        double acos = Math.acos(1.0);
        double atan = Math.atan(1.0);

        double sinh = Math.sinh(1.0);
        double cosh = Math.cosh(1.0);
        double tanh = Math.tanh(1.0);

        double degrees = Math.toDegrees(Math.PI);
        double radians = Math.toRadians(180);

        System.out.println("sin = " + sin);
        System.out.println("cos = " + cos);
        System.out.println("tan = " + tan);
        System.out.println("asin = " + asin);
        System.out.println("acos = " + acos);
        System.out.println("atan = " + atan);
        System.out.println("sinh = " + sinh);
        System.out.println("cosh = " + cosh);
        System.out.println("tanh = " + tanh);
        System.out.println("degrees = " + degrees);
        System.out.println("radians = " + radians);
    }
}