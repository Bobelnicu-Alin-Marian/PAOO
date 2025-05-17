import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(5, 2);

        ShapeAreaCalculator calculator = new ShapeAreaCalculator(
                Arrays.asList(circle, square, rectangle)
        );

        System.out.println("Total area = " + calculator.totalArea());
    }
}
