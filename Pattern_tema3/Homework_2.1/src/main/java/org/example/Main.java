public class Main {
    public static void main(String[] args) {
        try {
            // Creează un obiect Config și încarcă fișierul config.json
            Config config = Config.loadConfig("config.json");

            // Afișează valorile citite din fișier
            System.out.println("Culoare: " + config.getColor());
            System.out.println("Greutate: " + config.getWeight());
        } catch (Exception e) {
            // Gestionarea erorilor
            e.printStackTrace();
        }
    }
}
