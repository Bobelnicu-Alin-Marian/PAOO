public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("rectangle", 5.0, 3.0);
        Shape circle = ShapeFactory.createShape("circle", 2.0);

        System.out.println("Aria dreptunghiului: " + rectangle.getArea());
        System.out.println("Aria cercului: " + circle.getArea());
    }
}
