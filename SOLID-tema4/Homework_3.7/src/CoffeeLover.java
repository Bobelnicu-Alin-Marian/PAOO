import java.util.ArrayList;
import java.util.List;

public class CoffeeLover {
    private final List<CoffeeMachine> coffeeMachines = new ArrayList<>();

    public void addCoffeeMachine(CoffeeMachine machine) {
        this.coffeeMachines.add(machine);
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
