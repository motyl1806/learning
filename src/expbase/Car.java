package expbase;

public class Car {
    String brand;
    String model;
    String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void printInfo() {
        System.out.println("Brand: " + this.brand + "\nModel: " + this.model + "\nColor: " + this.color);
    }
}
