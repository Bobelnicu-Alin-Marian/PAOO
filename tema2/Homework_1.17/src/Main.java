import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Introduceți coeficientul a: ");
            Double a = scanner.nextDouble();
            System.out.print("Introduceți coeficientul b: ");
            Double b = scanner.nextDouble();
            System.out.print("Introduceți coeficientul c: ");
            Double c = scanner.nextDouble();

            Equation equation = new Equation(a, b, c);


            System.out.println(equation.solve());


        } catch (InvalidCoefficientException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (ComplexRootsException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A apărut o eroare neașteptată.");
        } finally {
            scanner.close();
        }
    }
}
