import java.util.ArrayList;
import java.util.List;

public class SumAreas {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();

        shapesList.add(new Circle(2));
        shapesList.add(new Rectangle(1, 3));
        shapesList.add(new Circle(1));

        for (Shape shape : shapesList) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.getArea());
        }
        
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.computeTotalArea(shapesList);

        System.out.println("Total Area: " + totalArea);
    }
}
