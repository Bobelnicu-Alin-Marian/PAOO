public class Main {
    public static void main(String[] args) {
        // Crearea unei mașini cu toate caracteristicile implicite
        Car car1 = new Car.CarBuilder("BMW", 2015)
                .build();

        System.out.println(car1);

        // Crearea unei mașini cu opțiuni specifice
        Car car2 = new Car.CarBuilder("Audi", 2012)
                .setElectricWindows(true)
                .setNavigation(true)
                .setpower(250)
                .build();

        System.out.println(car2);
    }
}
