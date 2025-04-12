public class Car {
    // required parameters
    private String brand;
    private int year;

    // optional parameters
    private boolean hasElectricWindows;
    private boolean hasNavigation;
    private boolean hasAutomaticTransmission;
    private int power; // New attribute for horsepower

    // Getters to access the data
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public boolean hasElectricWindows() {
        return hasElectricWindows;
    }

    public boolean hasNavigation() {
        return hasNavigation;
    }

    public boolean hasAutomaticTransmission() {
        return hasAutomaticTransmission;
    }

    public int getpower() {
        return power;
    }

    // Private constructor
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.year = builder.year;
        this.hasElectricWindows = builder.hasElectricWindows;
        this.hasNavigation = builder.hasNavigation;
        this.hasAutomaticTransmission = builder.hasAutomaticTransmission;
        this.power = builder.power; // Set horsepower from builder
    }

    // Override toString for displaying the details
    @Override
    public String toString() {
        return "brand=" + brand + ", year=" + year + ", electricWindows=" + hasElectricWindows
                + ", navigation=" + hasNavigation + ", automaticTransmission=" + hasAutomaticTransmission
                + ", horsepower=" + power;
    }

    // Builder Class - inner class
    public static class CarBuilder {
        // required parameters
        private String brand;
        private int year;

        // optional parameters
        private boolean hasElectricWindows;
        private boolean hasNavigation;
        private boolean hasAutomaticTransmission;
        private int power = 200; // Default value for horsepower is 200

        // Constructor for required parameters
        public CarBuilder(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        // Setters for optional parameters
        public CarBuilder setElectricWindows(boolean hasElectricWindows) {
            this.hasElectricWindows = hasElectricWindows;
            return this;
        }

        public CarBuilder setNavigation(boolean hasNavigation) {
            this.hasNavigation = hasNavigation;
            return this;
        }

        public CarBuilder setAutomaticTransmission(boolean hasAutomaticTransmission) {
            this.hasAutomaticTransmission = hasAutomaticTransmission;
            return this;
        }

        // Setter for horsepower (optional)
        public CarBuilder setpower(int power) {
            this.power = power;
            return this;
        }

        // Method to build the Car object
        public Car build() {
            return new Car(this);  // Calls the private constructor of Car with builder
        }
    }
}