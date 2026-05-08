package BasicsOfOOP;

public class CarObjects {

    public String color;

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public static void main(String[] args) {

        CarObjects car1 = new CarObjects();
        CarObjects car2 = new CarObjects();
        CarObjects car3 = new CarObjects();

        car1.setColor("Rojo");
        car2.setColor("Verde");
        car3.setColor("Azul");

        System.out.println("Color carro 1: " + car1.color);
        System.out.println("Color carro 2: " + car2.color);
        System.out.println("Color carro 3: " + car3.color);
    }
}