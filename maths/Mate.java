package maths;

import java.util.Scanner;

public class Mate {

    public void programa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");

        int opcion = scanner.nextInt();

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacionValida = true;

        switch(opcion) {
            case 1:
                Sumar sumar = new Sumar();
                resultado = sumar.operar(num1, num2);
                break;
            case 2:
                Restar restar = new Restar();
                resultado = restar.operar(num1, num2);
                break;
            case 3:
                Dividir dividir = new Dividir();
                resultado = dividir.operar(num1, num2);
                break;
            case 4:
                Multiplicar multiplicar = new Multiplicar();
                resultado = multiplicar.operar(num1, num2);
                break;
            default:
                operacionValida = false;
                System.out.println("Opción no válida.");
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}





