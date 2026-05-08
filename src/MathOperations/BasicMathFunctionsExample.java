package MathOperations;

public class BasicMathFunctionsExample {
    public static void main(String[] args) {
        int abs1 = Math.abs(10);
        int abs2 = Math.abs(-20);

        double ceil = Math.ceil(7.343);
        double floor = Math.floor(7.343);

        double result3 = Math.floorDiv(-100, 9);
        double result4 = -100 / 9;

        int min = Math.min(10, 20);
        int max = Math.max(10, 20);

        double roundedDown = Math.round(23.445);
        double roundedUp = Math.round(23.545);

        double random = Math.random();
        double random100 = Math.random() * 100D;

        System.out.println("abs1 = " + abs1);
        System.out.println("abs2 = " + abs2);
        System.out.println("ceil = " + ceil);
        System.out.println("floor = " + floor);
        System.out.println("floorDiv = " + result3);
        System.out.println("normal division = " + result4);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("roundedDown = " + roundedDown);
        System.out.println("roundedUp = " + roundedUp);
        System.out.println("random = " + random);
        System.out.println("random100 = " + random100);
    }
}