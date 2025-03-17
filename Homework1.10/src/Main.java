import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> cercuri = new ArrayList<>();

        cercuri.add(new Cerc(3));
        cercuri.add(new Cerc(5));
        cercuri.add(new Cerc(7));

        double totalArie = 0;
        for (Shape shape : cercuri) {
            System.out.println(shape);
            totalArie += shape.getArea();
        }

        System.out.printf("Aria totală a cercurilor este: %.2f\n", totalArie);
    }
}
