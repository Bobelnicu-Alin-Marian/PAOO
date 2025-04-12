// Decorator concret pentru Electric Windows (Geamuri electrice)
public class ElectricWindows extends CarDecorator {
    public ElectricWindows(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adăugat geamuri electrice.");
    }
    @Override
    public double getCost() {
        return super.getCost() + 200; // Cost suplimentar pentru geamuri electrice
    }
}
