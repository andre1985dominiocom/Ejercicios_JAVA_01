package Vista;
import Modelo.Ejercicio_10;
import java.util.Scanner;

public abstract class main_010 {
    public static void main(String[] args) {
        // Título de la entrada
        System.out.println("==== Programa para calcular el total de una compra con IVA ====");
        
//        Scanner teclado = new Scanner(System.in);
//        
//        // Ingresar datos
//        System.out.print("Ingresar el precio del producto: ");
//        double subtotal = teclado.nextDouble();
//        
//        System.out.print("");
        

        // Ejemplo de uso del método calcularTotalConIVA
        double[] precios = {10000, 25000, 30000, 40000, 50000}; // Precios de los 5 productos
        Ejercicio_10.calcularTotalConIVA(precios);
    }
}
