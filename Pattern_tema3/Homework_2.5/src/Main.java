public class Main {
    public static void main(String[] args) {
        C2Nr c2Nr = new C2Nr(1, 2);
        System.out.println("Suma (C2Nr): " + c2Nr.getSum()); // 3

        C3Nr c3Nr = new C3Nr(1, 2, 3);
        System.out.println("Suma (C3Nr): " + c3Nr.getSum()); // 6

        C3Nr converted = C2ToC3Adapter.convert(c2Nr);
        System.out.println("Suma (C2Nr convertit în C3Nr): " + converted.getSum()); // 3
    }
}
