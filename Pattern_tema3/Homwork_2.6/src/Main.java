public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", 500.0);
        System.out.println("Product in USD: " + product.getName() + ", Price: " + product.getPriceInUSD() + " USD");


        Produs produs = ConverterHelper.ProductToProdus(product);
        System.out.println("Produs in RON: " + produs.getNume() + ", Price: " + produs.getPretInLei() + " RON");


        Product productBack = ConverterHelper.ProdusToProduct(produs);
        System.out.println("Product converted back: " + productBack.getName() + ", Price: " + productBack.getPriceInUSD() + " USD");
    }
}
