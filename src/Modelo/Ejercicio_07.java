// 7. Calcular todos los pagos hechos de un restaurante y que si el consumo ingresado excede los
// $130.000 el descuento será del 15%, de lo contrario no hay descuento.

package Modelo;

public class Ejercicio_07 {
    
    public static double calcularPago(double consumo) { // Crear un método estático para calcular el pago
        // validar si el consumo excede los $130.000
        double descuento = 0.0;

        // Si el consumo es mayor a $130.000, aplicar un descuento del 15%
        if (consumo > 130000) {
            descuento = consumo * 0.15;
        }

        // Retornar el pago final después de aplicar el descuento
        return consumo - descuento;
    }
}
