public class Equation {
    private double a, b;
    public Equation(double _a, double _b){
        this.a = _a;
        this.b = _b;
    }
    public double solve() throws NoSolution, InfinitSolution{
        if(a == 0 && b == 0) {
            throw new InfinitSolution("O infinitate de solutii");
        }
        else if(a == 0 && b != 0){
            throw new NoSolution("Nu exista solutii");
        }
        else{
            return -b/a;
        }
    }
}
