public class Main {
    public static void main(String[] args) {
        // Creăm un prelungitor
        Prelungitor prelungitor = new Prelungitor();

        // Creăm aparate electrice
        AparatElectric aparatCafea = new AparatElectric("Aparatul de cafea");
        AparatElectric aparatFrigider = new AparatElectric("Frigiderul");
        AparatElectric aparatTelevizor = new AparatElectric("Televizorul");


        prelungitor.adaugaObserver(aparatCafea);
        prelungitor.adaugaObserver(aparatFrigider);
        prelungitor.adaugaObserver(aparatTelevizor);

        // Conectăm prelungitorul
        prelungitor.conecteaza();
        System.out.print("\n\n\n");
        // Scoatem prelungitorul din priză
        prelungitor.deconecteaza();
    }
}
