public class CoffeeLover {
    private CoffeeMachine simple;
    private CoffeeMachine complex;

    public CoffeeLover() {
        this.simple = new SimpleCoffeeMachine();
        this.complex = new ComplexCoffeeMachine();
    }

    public void makeCoffee() {
        simple.start();
        complex.start();
    }
}
