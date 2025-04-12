
public class Main {
    public static void main(String[] args) {
        // Creăm o mașină simplă
        Car sportsCar = new Car();

        // Decorează mașina cu Electric Windows
        Car sportsCarWindows = new ElectricWindows(sportsCar);
        sportsCarWindows.assemble();
        System.out.println("Costul total: " + sportsCarWindows.getCost());

        System.out.println("\n*****\n");

        // Decorează mașina cu  Electric Windows și Navigation System
        Car sportsCarFull = new NavigationSystem(sportsCarWindows);
        sportsCarFull.assemble();
        System.out.println("Costul total: " + sportsCarFull.getCost());
    }
}
