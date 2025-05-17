public class Main {
    public static void main(String[] args) {
        System.out.println("--- Using SimplePrinter ---");
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print();

        System.out.println("\n--- Using PrinterScanner ---");
        PrinterScanner printerScanner = new PrinterScanner();
        printerScanner.print();
        printerScanner.scan();

        System.out.println("\n--- Using FullMultifunctionalPrinter ---");
        MultifunctionalPrinter fullPrinter = new FullMultifunctionalPrinter();
        fullPrinter.print();
        fullPrinter.scan();
        fullPrinter.fax();
    }
}
