// 10. Calcular el valor total del valor de 5 productos, el IVA y el subtotal, visualizar los resultados de:
// Iva, Subtotal y Total de la compra de los artículos.
package Modelo;

public class Ejercicio_10 {
    
    public static void calcularTotalConIVA(double[] precios) {
        double subtotal = 0.0;
        double iva = 0.0;
        double total = 0.0;

        // Calcular el subtotal sumando los precios de los productos
        for (double precio : precios) {
            subtotal += precio;
        }
        if (precios.length != 5) {
            System.out.println("Advertencia: Se esperaban 5 productos, pero se recibieron " + precios.length);
        } else {
            System.out.println("Se recibieron los 5 productos esperados.");
        }

        // Calcular el IVA (19% del subtotal)
        iva = subtotal * 0.19;

        // Calcular el total (subtotal + IVA)
        total = subtotal + iva;

        // Mostrar los resultados
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total a pagar: $" + total);
    }
}
    
