public class ShapeFactory {

    public static Shape createShape(String type, double... params) {
        if (type.equalsIgnoreCase("rectangle") && params.length == 2) {
            return new Rectangle(params[0], params[1]);
        } else if (type.equalsIgnoreCase("circle") && params.length == 1) {
            return new Circle(params[0]);
        } else {
            throw new IllegalArgumentException("Forma necunoscută sau parametri incorecți!");
        }
    }
}
