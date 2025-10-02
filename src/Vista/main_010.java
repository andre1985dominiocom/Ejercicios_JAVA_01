package Vista;
import Modelo.Ejercicio_10;

public abstract class main_010 {
    public static void main(String[] args) {
        // Título de la entrada
        System.out.println("==== Programa para calcular el total de una compra con IVA ====");

        // Ejemplo de uso del método calcularTotalConIVA
        double[] precios = {10000, 25000, 30000, 40000, 50000}; // Precios de los 5 productos
        Ejercicio_10.calcularTotalConIVA(precios);
    }
}
