package Vista;
import Modelo.Ejercicio_08;

import java.util.Scanner;

public abstract class Main_008 {
    
    // Título de la entrada
    public static void main(String[] args) {
        System.out.println("==== Programa para calcular pagos de empleados ====");

        //Llamar la clase Scanner para leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tipo de empleado
        System.out.print("Ingresar el tipo de empleado (planta/administrativo): ");
        String tipoEmpleado = scanner.nextLine();

        // Solicitar el total de horas trabajadas
        System.out.print("Ingresar el total de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        // Calcular el pago utilizando la clase Ejercicio_o8
        double pagoTotal = Ejercicio_08.calcularPago(tipoEmpleado, horasTrabajadas);

        // Mostrar el resultado
        System.out.println("El pago total es: $" + pagoTotal);

        // Cerrar el scanner
        scanner.close();
    }
}
