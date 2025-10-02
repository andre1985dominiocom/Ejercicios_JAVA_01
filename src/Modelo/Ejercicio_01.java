// 1. Determinar si un número es positivo y menor que 100.
package Modelo;


public class Ejercicio_01 {
    public void numeroPositivo(int num1) { // Crear método de la clase ejercicio_01
        
        // Determinar si el número es positivo y menor que 100 utilizando condicionales if y else
        if (num1 > 0 && num1 < 100){
            System.out.println("El numero es " + num1 + " es positivo y menor que 100. ");
        } else {
            System.out.println("El numero " + num1 + " NO cumple la codicion. " );
        }
    }
}
