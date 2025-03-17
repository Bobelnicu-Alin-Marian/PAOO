public class Cerc implements Shape {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double getArea() {
        return Math.PI * raza * raza;
    }

    @Override
    public String toString() {
        return String.format("Cerc cu raza %.2f și aria %.2f", raza, getArea());
    }
}
