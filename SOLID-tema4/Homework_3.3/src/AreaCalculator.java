import java.util.List;

public class AreaCalculator {
    public double computeTotalArea(List<Shape> shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}
