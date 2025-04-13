public interface Subject {
    void adaugaObserver(Observer observer);
    void eliminaObserver(Observer observer);
    void notificaObservatori(String mesaj);
}
