public class SimpleCoffeeMachine implements CoffeeMachine {

    @Override
    public void start() {
        System.out.println("=== Preparare cafea simplă ===");
        System.out.println("1. Încălzesc apa...");
        System.out.println("2. Pun cafeaua măcinată în filtru...");
        System.out.println("3. Prepar cafeaua simplă.");
        System.out.println("Cafeaua simplă este gata!");
    }

    @Override
    public String getCoffeeType() {
        return "Cafea Simplă";
    }
}
