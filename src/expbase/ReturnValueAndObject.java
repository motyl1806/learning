package expbase;

class Circle {
    float radius;

    Circle(float r){
        radius = r;
    }
}

class MathMethods {
    public int add (int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public Circle getNewCircle(float radius) {
        Circle c = new Circle(radius);
        return c;
    }
}

public class ReturnValueAndObject {
    public static void main(String[] args) {
        MathMethods math = new MathMethods();
        int a = 12;
        int b = 3;
        int result = math.add(a, b);
        System.out.println(result);
        int result2 = math.substract(a, b);
        System.out.println(result2);

        Circle circle = math.getNewCircle(10.0f);
        System.out.println("Radius: " + circle.radius);
    }
}
