public class ComplexOperations {

    public static ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        return nr1.add(nr2);
    }

    public static ComplexNumber suma(Double nr1, Double nr2) {
        ComplexNumber c1 = ComplexAdapter.fromDouble(nr1);
        ComplexNumber c2 = ComplexAdapter.fromDouble(nr2);
        return c1.add(c2);
    }

    public static ComplexNumber suma(ComplexNumber nr1, Double nr2) {
        Double mod1 = ComplexAdapter.toDouble(nr1);
        Double result = mod1 + nr2;
        return ComplexAdapter.fromDouble(result);
    }

    public static ComplexNumber suma(Double nr1, ComplexNumber nr2) {
        Double mod2 = ComplexAdapter.toDouble(nr2);
        Double result = nr1 + mod2;
        return ComplexAdapter.fromDouble(result);
    }
}
