public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4); // modul = 5
        ComplexNumber c2 = new ComplexNumber(1, 2);

        System.out.println("suma(c1, c2) = " + ComplexOperations.suma(c1, c2));
        System.out.println("suma(2.0, 3.0) = " + ComplexOperations.suma(2.0, 3.0));
        System.out.println("suma(c1, 2.0) = " + ComplexOperations.suma(c1, 2.0));
        System.out.println("suma(2.0, c2) = " + ComplexOperations.suma(2.0, c2));
    }
}
