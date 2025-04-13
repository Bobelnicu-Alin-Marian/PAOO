import java.util.ArrayList;
import java.util.List;

public class Curs implements Subject {
    private List<Observer> studenti = new ArrayList<>();

    public void adaugaStudent(Observer student) {
        studenti.add(student);
    }

    public void prezenta() {
        System.out.println("Lista de prezență:");
        for (Observer student : studenti) {
            student.actualizeaza();
        }
    }
}
