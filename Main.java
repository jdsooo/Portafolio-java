import jdso.Banner;
import opciones.opciones;
import ConversorDeUnidades.ConversorDeUnidades;
public class Main {
    public static void main(String[] args) {
        // Mostrar mensaje de bienvenida
        Banner.mensaje();

        // Ejecutar el programa de opciones matemáticas
        opciones.cargaropciones();

        // Ejecutar el programa de cálculo de IMC
        programas.IMC.main(args);
    }
}
