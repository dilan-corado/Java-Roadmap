package BasicsOfOOP;

public class CarMethods {

    public String brand = null;
    public String model = null;
    public String color = null;

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public static void main(String[] args) {

        CarMethods car1 = new CarMethods();

        car1.brand = "Honda";
        car1.model = "Civic";

        car1.setColor("Azul");

        System.out.println("Marca: " + car1.brand);
        System.out.println("Modelo: " + car1.model);
        System.out.println("Color: " + car1.color);
    }
}