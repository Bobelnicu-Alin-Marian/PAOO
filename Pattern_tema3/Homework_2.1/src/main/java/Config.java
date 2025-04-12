import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Config {
    private String color;
    private int weight;

    // Getters și setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Metodă pentru a încărca datele din fișierul JSON
    public static Config loadConfig(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), Config.class);
    }

    public static void main(String[] args) {
        try {
            // Încarcă fișierul JSON
            Config config = loadConfig("config.json");
            System.out.println("Culoare: " + config.getColor());
            System.out.println("Greutate: " + config.getWeight());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
