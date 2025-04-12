// Decorator concret pentru Navigation System (Sistem de navigație)
public class NavigationSystem extends CarDecorator {
    public NavigationSystem(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adăugat sistem de navigație.");
    }
    @Override
    public double getCost() {
        return super.getCost() + 800; // Cost suplimentar pentru navigatie
    }
}
