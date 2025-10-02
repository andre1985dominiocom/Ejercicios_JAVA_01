// 13. En una tienda de HELADO da un descuento por compra a sus clientes con membresía
// dependiendo de su tipo, sólo existen tres tipos de membresía, tipo A, tipo B y tipo C.
// Los descuentos son los siguientes:
// Tipo A 10% de descuento
// Tipo B 15% de descuento
// Tipo C 20% de descuento

package Modelo;

public class Ejercicio_13 {
    public static String calcularDescuento(double precio, String tipoMembresia) {
        double descuento;
        switch (tipoMembresia.toUpperCase()) {
            case "A":
                descuento = precio * 0.10;
                break;
            case "B":
                descuento = precio * 0.15;
                break;
            case "C":
                descuento = precio * 0.20;
                break;
            default:
                return "Tipo de membresía no válido. Use A, B o C.";
        }
        double precioFinal = precio - descuento;
        return "El precio final con descuento es: $" + precioFinal + " (Descuento aplicado: $" + descuento + ")";
    }
}
