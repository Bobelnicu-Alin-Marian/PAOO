import java.util.Scanner;
public class Calcul {
    public double suma() throws InvalidInput{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți primul număr: ");
        String input1 = scanner.nextLine();
        Double numar1 = convertToDouble(input1);
        System.out.print("Introduceți al doilea număr: ");
        String input2 = scanner.nextLine();
        Double numar2 = convertToDouble(input2);

        return numar1 + numar2;
    }

    private Double convertToDouble(String input) throws InvalidInput {
        // Verificăm dacă inputul este gol
        if (input == null || input.isEmpty()) {
            if (input == null) {
                throw new NullPointerException("Input-ul nu poate fi null.");
            }
        }

        try {
            // Încercăm să convertim inputul într-un număr de tip Double
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            // Dacă nu este un număr valid, aruncăm o excepție custom
            throw new InvalidInput("Input-ul nu este un număr valid: " + input);
        }
    }
}
