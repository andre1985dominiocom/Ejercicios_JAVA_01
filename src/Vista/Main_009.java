package Vista;
import Modelo.Ejercicio_09;

public abstract class Main_009 {
    public static void main(String[] args) {
        // Título de la entrada
        System.out.println("==== Programa para leer N números, calcular la suma de los pares y el producto de los impares ====");

        // Ejemplo de uso del método calcularSumaProducto
        int[] numeros = {0, 1, 2, 3, 4, 5}; // Cambiar estos números por cualquier conjunto de números
        Ejercicio_09.calcularSumaProducto(numeros);
    }
}
