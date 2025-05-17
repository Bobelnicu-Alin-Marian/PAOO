import java.util.List;

public class CoffeeLover {
    private final List<CoffeeMachine> coffeeMachines;

    public CoffeeLover(List<CoffeeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public void makeCoffee() {
        for (CoffeeMachine machine : coffeeMachines) {
            System.out.println("Încep prepararea pentru: " + machine.getCoffeeType());
            machine.start();
            System.out.println();
        }
        System.out.println("Toate cafelele sunt gata!");
    }
}
