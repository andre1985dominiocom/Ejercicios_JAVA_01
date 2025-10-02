// 9. Realizar el algoritmo que lea N números, calcule y escriba la suma de los pares y el producto de
// los impares. Numero par es aquel que su residuo igual a cero (num mod !=0)
package Modelo;

public class Ejercicio_09 {
    public static void calcularSumaProducto(int[] numeros) { // Crear un método estático para calcular la suma de pares y el producto de impares
        int sumaPares = 0;
        int productoImpares = 1;
        boolean hayImpares = false; // Bandera para verificar si hay números impares

        for (int numero : numeros) {
            if (numero % 2 == 0) { // Número par
                sumaPares += numero;
            } else { // Número impar
                productoImpares *= numero;
                hayImpares = true; // Se encontró al menos un número impar
            }
        }

        System.out.println("Suma de los números pares: " + sumaPares);
        if (hayImpares) {
            System.out.println("Producto de los números impares: " + productoImpares);
        } else {
            System.out.println("No se ingresaron números impares.");
        }
    }
}
