// Clasa abstractă care decorează o mașină
public abstract class CarDecorator extends Car {
    protected Car decoratedCar;

    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }
    @Override
    public void assemble() {
        this.decoratedCar.assemble();
    }
    @Override
    public double getCost() {
        return decoratedCar.getCost(); // Costul de bază plus costurile adăugate de decoratori
    }
}
