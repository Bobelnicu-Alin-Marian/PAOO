package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a =  ");
        double a = scanner.nextDouble();

        System.out.print("b =  ");
        double b = scanner.nextDouble();


        EquationSolver solver = new EquationSolver();
        EquationResult result = solver.solve(a, b);

        EquationSerializer serializer = new EquationSerializer();
        serializer.saveAsJson(result, "equation_result.json");
    }
}
