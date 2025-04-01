import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creăm instanța clasei FileProcessor
        FileProcessor fileProcessor = new FileProcessor();


        String numeFisier = "input.txt";

        try {
            // Calculăm suma numerelor întregi din fișier
            int suma = fileProcessor.sumaNumerelorIntregi(numeFisier);

            // Afișăm rezultatul
            System.out.println("Suma numerelor întregi din fișier este: " + suma);
        } catch (InvalidInput e) {
            // Afișăm mesajul excepției doar dacă nu au fost găsite numere valide
            System.out.println(e.getMessage());
        }
    }
}
