package expbase;

public class CarFactory {
    public Car buildCar(){
        String color[] = {"red", "black", "white"};
        int random = (int) (Math.random() * color.length);
        String randomColor = color[random];

        return new Car("Ford","Mustang",randomColor);
    }
}
