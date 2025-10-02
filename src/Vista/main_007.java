package Vista;
import Modelo.Ejercicio_07;

public abstract class main_007 {
    public static void main(String[] args) {

        // Título de la entrada
        System.out.println("==== Programa para calcular pagos en un restaurante ====");

        // Ejemplo de uso del método calcularPago
        double consumo = 200000;

        // Calcular el pago final
        double pagoFinal = Ejercicio_07.calcularPago(consumo);

        // Mostrar el resultado
        System.out.println("El pago final es: " + pagoFinal);
    }
}
