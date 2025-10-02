
package Vista;
import Modelo.Ejercicio_11;
import java.util.Scanner;

public abstract class Main_011 {
    public static void main(String[] args) {
    // Título de la entrada
    System.out.println("==== Programa para gestionar datos de estudiantes ====");
    Scanner teclado = new Scanner(System.in);
    
    int numeroEstudiantes = 5; // Número de estudiantes
    Ejercicio_11 curso = new Ejercicio_11(numeroEstudiantes);

    System.out.println("\n==== Estudiantes ====");
    for (int i = 0; i < numeroEstudiantes; i++) {
        System.out.println("Estudiante " + (i + 1) + ": " +
                            curso.nombres[i] + " " + curso.apellidos[i] +
                            ", Edad: " + curso.edades[i] +
                            " (" + curso.mayorEdad(i) + ")" +
                            ", Nota Promedio: " + curso.notasPromedio[i] +
                            " (" + curso.resultado(i) + ")");

        // Solicitar datos del estudiante
        System.out.print("Ingresar el nombre del estudiante " + (i + 1) + ": ");
        curso.nombres[i] = teclado.nextLine();

        System.out.print("Ingresar el apellido del estudiante " + (i + 1) + ": ");
        curso.apellidos[i] = teclado.nextLine();

        System.out.print("Ingresar la edad del estudiante " + (i + 1) + ": ");
        curso.edades[i] = teclado.nextInt();

        System.out.print("Ingresar la nota promedio del estudiante " + (i + 1) + ": ");
        curso.notasPromedio[i] = teclado.nextDouble();

        System.out.println(); // Línea en blanco para mejor legibilidad

        teclado.nextLine(); // Limpiar el buffer del teclado

    }
}
}