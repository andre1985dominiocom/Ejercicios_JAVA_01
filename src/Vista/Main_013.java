package Vista;
import Modelo.Ejercicio_13;
import java.util.Scanner;

public abstract class Main_013 {
    public static void main(String[] args) {
        // Título de la entrada
        System.out.println("==== Programa para aplicar descuentos según el tipo de membresía ====");
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso del método aplicarDescuento
        System.out.print("Ingresar el tipo de membresía (A, B o C): ");
        char tipoMembresia = scanner.next().charAt(0);
        System.out.print("Ingresar el precio original del helado: ");
        double precioOriginal = scanner.nextDouble();

        // Llamar al método y mostrar el resultado
        String resultado = Ejercicio_13.calcularDescuento(precioOriginal, String.valueOf(tipoMembresia));
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Tipo de membresía: " + tipoMembresia);
        System.out.println(resultado);
    }
}
