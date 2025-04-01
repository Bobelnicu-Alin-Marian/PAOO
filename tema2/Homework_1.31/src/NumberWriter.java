import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumberWriter extends Thread {
    private String fileName;

    public NumberWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Random random = new Random();
        int number = random.nextInt(100); // Generează un număr între 0 și 99

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(String.valueOf(number));
            System.out.println("A fost scris " + number + " în " + fileName);
        } catch (IOException e) {
            System.out.println("Eroare la scrierea în " + fileName + ": " + e.getMessage());
        }
    }
}
