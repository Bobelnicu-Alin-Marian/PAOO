import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creăm lista inițială de string-uri
        List<String> lista = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot", "blueberry");

        // Aplicăm Stream API: filtrare, uppercase, sortare și afișare
        List<String> rezultat = lista.stream()
                .filter(s -> s.startsWith("a"))   // Filtrăm doar string-urile care încep cu "a"
                .map(String::toUpperCase)         // Convertim fiecare string în uppercase
                .sorted()                         // Sortăm crescător (alfabetic)
                .collect(Collectors.toList());    // Convertim stream-ul în listă

        // Afișăm lista finală sortată crescător
        System.out.println("Lista sortată crescător: " + rezultat);

        // Sortare descrescătoare
        List<String> rezultatDescrescator = lista.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))  // Sortăm descrescător
                .collect(Collectors.toList());

        // Afișăm lista finală sortată descrescător
        System.out.println("Lista sortată descrescător: " + rezultatDescrescator);
    }
}
