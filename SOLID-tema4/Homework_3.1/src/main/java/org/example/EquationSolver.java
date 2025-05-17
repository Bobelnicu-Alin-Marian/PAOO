package org.example;


public class EquationSolver {

    public EquationResult solve(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return new EquationResult("Infinite solutions", null);
            } else {
                return new EquationResult("No solution", null);
            }
        } else {
            double x = -b / a;
            return new EquationResult("One solution", x);
        }
    }
}
