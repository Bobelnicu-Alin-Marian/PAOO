import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        ShapeDrawer drawer = new ShapeDrawer(shapes);
        drawer.drawAll();
    }
}
