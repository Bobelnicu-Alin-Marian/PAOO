import java.util.ArrayList;
import java.util.List;
public class ShapeDrawer {
    private List<Shape> shapes;

    public ShapeDrawer(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
