import java.util.Random;

public class Student implements Observer {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    @Override
    public void actualizeaza() {
        Random rand = new Random();
        String status = rand.nextBoolean() ? "Prezent" : "Absent";
        System.out.println("Studentul " + nume + " este " + status);
    }

    public String getNume() {
        return nume;
    }
}
