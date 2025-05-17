public class Main {
    public static void main(String[] args) {
        CoffeeLover lover = new CoffeeLover();

        lover.addCoffeeMachine(new SimpleCoffeeMachine());
        lover.addCoffeeMachine(new ComplexCoffeeMachine());

        lover.makeCoffee();
    }
}
