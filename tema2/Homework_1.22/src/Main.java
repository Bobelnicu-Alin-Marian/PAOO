public class Main {
    public static void main(String[] args) {
        try {
            // Creăm un obiect din clasa Calculator și apelăm metoda de calcul
            Calcul calculator = new Calcul();
            double suma = calculator.suma();
            System.out.println("Suma celor două numere este: " + suma);
        } catch (Exception e) {
            // Afișăm erorile
            System.out.println(e.getMessage());
        }
    }
}
