public class ComplexAdapter {

    // Convertim un Double la ComplexNumber (imaginar = 0)
    public static ComplexNumber fromDouble(Double value) {
        return new ComplexNumber(value, 0);
    }

    // Convertim un ComplexNumber la Double (prin modul)
    public static Double toDouble(ComplexNumber complex) {
        return complex.modulus();
    }
}
