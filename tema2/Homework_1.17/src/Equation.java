public class Equation {
    private Double a, b, c;

    // Constructor cu verificări pentru coeficienți
    public Equation(Double a, Double b, Double c) throws InvalidCoefficientException {
        if (a == 0) {
            throw new InvalidCoefficientException("Coeficientul 'a' nu poate fi zero! Nu este ecuație de gradul 2.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Double getDiscriminant() {
        return b * b - 4 * a * c;
    }


    public String solve() throws ComplexRootsException {
        Double discriminant = getDiscriminant();

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Rădăcini reale distincte: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return "O singură rădăcină reală: x = " + x;
        } else {
            throw new ComplexRootsException("Nu există rădăcini reale, soluțiile sunt complexe.");
        }
    }
}
