package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    public static String opciones6[] = {"Lista de compras", "Salir"};

    public static void programa() {
        ListaOpciones.cargaropciones(opciones6);

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();

        switch (r) {
            case 1:
                crear();
                break;
            case 2:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    // Método para crear lista de compras
    public static void crear() {
        List<String> listaVacia = new ArrayList<>();
        System.out.println("Se ha creado una lista de compras vacía.");
        System.out.println(listaVacia);
    }

    public static void main(String[] args) {
        programa();
    }
}