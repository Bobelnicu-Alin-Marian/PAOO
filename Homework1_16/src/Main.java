public class Main{
    public static void main(String[] args) {
        Equation e1 = new Equation(0, 0);
        Equation e2 = new Equation(0, 2);
        Equation e3 = new Equation(8, 2);

        try {
            System.out.println("Rezolvare e1: " + e1.solve());
        } catch (NoSolution | InfinitSolution e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Rezolvare e2: " + e2.solve());
        } catch (NoSolution | InfinitSolution e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Rezolvare e3: " + e3.solve());
        } catch (NoSolution | InfinitSolution e) {
            System.out.println(e.getMessage());
        }
    }
}