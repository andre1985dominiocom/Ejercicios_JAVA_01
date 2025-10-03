package Vista;
import Modelo.Ejercicio_07;
import java.util.Scanner;

public abstract class main_007 {
    public static void main(String[] args) {

        // Título de la entrada
        System.out.println("==== Programa para calcular pagos en un restaurante ====");
        
        // Llamar la clase Scanner para solicitar al usuario el valor a pagar
        Scanner teclado = new Scanner(System.in);
        
        // Ingresar datos
        System.out.print("Ingresar el valor del consumo: ");
        double consumo = teclado.nextDouble();
        
        // Llamar el método para para calcular el pago
        Ejercicio_07 resultado = new Ejercicio_07();
        resultado.calcularPago(consumo);

        // Calcular el consumo y el pago final
        double descuento = consumo * 0.15;
        double pagoFinal = Ejercicio_07.calcularPago(consumo);
        

        // Mostrar el resultado
        System.out.println("El valor del descuento es: " + descuento);
        System.out.println("El pago final es: " + pagoFinal);
    }
}
