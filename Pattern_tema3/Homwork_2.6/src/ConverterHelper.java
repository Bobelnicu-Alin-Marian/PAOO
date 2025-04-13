public class ConverterHelper {

    // Presupunem că 1 USD = 5 RON
    private static final double EXCHANGE_RATE = 5.0;

    // Conversie de la Product (USD) la Produs (RON)
    public static Produs ProductToProdus(Product product) {
        double pretInLei = product.getPriceInUSD() * EXCHANGE_RATE;
        return new Produs(product.getId(), product.getName(), pretInLei);
    }

    // Conversie de la Produs (RON) la Product (USD)
    public static Product ProdusToProduct(Produs produs) {
        double priceInUSD = produs.getPretInLei() / EXCHANGE_RATE;
        return new Product(produs.getId(), produs.getNume(), priceInUSD);
    }
}
