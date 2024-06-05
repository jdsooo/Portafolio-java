package maths;

public class Dividir {
    public double operar(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return Double.NaN;
        }
        return a / b;
    }
}
