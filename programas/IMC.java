package programas;

import java.util.Scanner;

public class IMC {

    public static double calcularIMc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void programaIMC() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su peso (kg): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Descartar la entrada no válida
                System.out.print("Ingrese su peso (kg): ");
            }
            double peso = scanner.nextDouble();

            System.out.print("Ingrese su altura (m): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Descartar la entrada no válida
                System.out.print("Ingrese su altura (m): ");
            }
            double altura = scanner.nextDouble();

            double imc = calcularIMc(peso, altura);
            System.out.printf("Su IMC es: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Usted está bajo de peso.");
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Usted tiene un peso normal.");
            } else if (imc >= 25 && imc < 29.9) {
                System.out.println("Usted tiene sobrepeso.");
            } else {
                System.out.println("Usted tiene obesidad.");
            }
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        programaIMC();
    }
}
