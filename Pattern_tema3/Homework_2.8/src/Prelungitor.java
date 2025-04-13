import java.util.ArrayList;
import java.util.List;

public class Prelungitor implements Subject {
    private List<Observer> aparate = new ArrayList<>();
    private boolean esteBogat;

    public Prelungitor() {
        esteBogat = false; // Presupunem că prelungitorul este inițial scos din priză
    }

    @Override
    public void adaugaObserver(Observer observer) {
        aparate.add(observer);
    }

    @Override
    public void eliminaObserver(Observer observer) {
        aparate.remove(observer);
    }

    @Override
    public void notificaObservatori(String mesaj) {
        for (Observer observer : aparate) {
            observer.actualizeaza(mesaj);
        }
    }

    // Metoda de conectare
    public void conecteaza() {
        if (!esteBogat) {
            esteBogat = true;
            notificaObservatori("Prelungitorul a fost băgat în priză.");
        }
    }

    // Metoda de deconectare
    public void deconecteaza() {
        if (esteBogat) {
            esteBogat = false;
            notificaObservatori("Prelungitorul a fost scos din priză.");
        }
    }
}
