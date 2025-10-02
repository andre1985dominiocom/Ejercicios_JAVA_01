// 11. Programa para solicitar el nombre, apellido, edad y la nota promedio de 5 estudiantes de un
// curso de computación.

package Modelo;

public class Ejercicio_11 {

    // Crear variables para almacenar los datos de los estudiantes
    public String[] nombres;
    public String[] apellidos;
    public int[] edades;
    public double[] notasPromedio;

    // Constructor para inicializar los arreglos
    public Ejercicio_11(int numeroEstudiantes) {
        nombres = new String[numeroEstudiantes];
        apellidos = new String[numeroEstudiantes];
        edades = new int[numeroEstudiantes];
        notasPromedio = new double[numeroEstudiantes];
    }

    // Métodos para establecer el aprobado o reprobado y mayor o menor de edad
    public String resultado(int i) {
        if (notasPromedio[i] >= 3.0) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

    public String mayorEdad(int i) {
        if (edades[i] >= 18) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }
}

