package ConversorDeUnidades;

import java.util.Scanner;

public class ConversorDeUnidades {

    // Método para convertir longitud
    public static void convertirLongitud() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud en metros:");
        double metros = scanner.nextDouble();

        double pies = metros * 3.281; // Convertir a pies
        double pulgadas = metros * 39.37; // Convertir a pulgadas

        System.out.println("Longitud en pies: " + pies);
        System.out.println("Longitud en pulgadas: " + pulgadas);

        scanner.close();
    }

    // Método para convertir peso
    public static void convertirPeso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso en kilogramos:");
        double kilogramos = scanner.nextDouble();

        double libras = kilogramos * 2.205;
        double onzas = kilogramos * 35.274;

        System.out.println("Peso en libras: " + libras);
        System.out.println("Peso en onzas: " + onzas);

        scanner.close();
    }

    public static void convertirVolumen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el volumen en litros:");
        double litros = scanner.nextDouble();

        double galones = litros * 0.264; // Convertir a galones
        double mililitros = litros * 1000; // Convertir a mililitros

        System.out.println("Volumen en galones: " + galones);
        System.out.println("Volumen en mililitros: " + mililitros);

        scanner.close();
    }
}
