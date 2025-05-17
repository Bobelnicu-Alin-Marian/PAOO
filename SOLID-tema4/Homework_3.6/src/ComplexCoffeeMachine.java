public class ComplexCoffeeMachine implements CoffeeMachine {

    @Override
    public void start() {
        System.out.println("=== Preparare cafea complexă ===");
        System.out.println("1. Măcin boabele proaspete...");
        System.out.println("2. Încălzesc apa...");
        System.out.println("3. Prepar espresso...");
        System.out.println("4. Adaug lapte spumat și sirop...");
        System.out.println("Cafeaua complexă (ex: cappuccino) este gata!");
    }

    @Override
    public String getCoffeeType() {
        return "Cappuccino";
    }
}
