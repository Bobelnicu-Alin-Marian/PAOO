import java.util.List;

public class ShapeAreaCalculator {
    private List<Shape> shapes;

    public ShapeAreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double totalArea() {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}
