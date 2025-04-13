public class AparatElectric implements Observer {
    private String nume;

    public AparatElectric(String nume) {
        this.nume = nume;
    }

    @Override
    public void actualizeaza(String mesaj) {
        System.out.println(nume + ": " + mesaj);
    }
}
