package BasicsOfOOP;

public class CarConstructor {

    public String brand = null;
    public String model = null;
    public String color = null;

    // Constructor vacío
    public CarConstructor() {

    }

    // Constructor con parámetros
    public CarConstructor(String theBrand, String theModel, String theColor) {
        this.brand = theBrand;
        this.model = theModel;
        this.color = theColor;
    }

    public static void main(String[] args) {

        CarConstructor car1 = new CarConstructor();
        CarConstructor car2 = new CarConstructor("Toyota", "Corolla", "Rojo");

        System.out.println("Carro 1:");
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.color);

        System.out.println("----------------");

        System.out.println("Carro 2:");
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.color);
    }
}