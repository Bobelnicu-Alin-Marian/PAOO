public class PrinterScanner implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document from PrinterScanner...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document from PrinterScanner...");
    }
}
