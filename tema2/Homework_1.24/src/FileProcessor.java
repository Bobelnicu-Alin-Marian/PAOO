import java.io.*;

public class FileProcessor {

    // Metoda care calculează suma numerelor întregi din fișier
    public int sumaNumerelorIntregi(String numeFisier) throws InvalidInput{
        int suma = 0;
        boolean gasitNumarIntreg = false; // Variabilă pentru a verifica dacă am găsit cel puțin un număr întreg valid
        try (BufferedReader reader = new BufferedReader(new FileReader(numeFisier))) {
            String linie;
            while ((linie = reader.readLine()) != null) {
                try {
                    // Încercăm să convertim linia în număr întreg
                    int numar = Integer.parseInt(linie);
                    suma += numar;
                    gasitNumarIntreg = true; // Am găsit un număr valid
                } catch (NumberFormatException e) {
                    // Dacă nu este un număr valid, ignorăm linia
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit: " + numeFisier);
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
        }

        // Dacă nu am găsit niciun număr întreg valid, aruncăm o excepție standard
        if (!gasitNumarIntreg) {
            throw new InvalidInput("Nu au fost găsite numere întregi valide în fișier.");
        }

        return suma;
    }
}
