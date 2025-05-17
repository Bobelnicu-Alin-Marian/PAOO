public class FullMultifunctionalPrinter implements MultifunctionalPrinter {
    @Override
    public void print() {
        System.out.println("Printing document from FullMultifunctionalPrinter...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document from FullMultifunctionalPrinter...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document from FullMultifunctionalPrinter...");
    }
}
