// 2. Calcule el mayor de tres números, permitiendo leer 3 valores diferentes
package Modelo;

public class Ejercicio_02 {

    public void numeroMayor(int num1, int num2, int num3) { // Crear método de la clase ejercicio_02

        // Calcular los tres números
        int calcular = num1 + num2 + num3;
        System.out.println("El resultado de la operacion es: " + calcular);
        
        // Determinar el mayor de tres números utilizando condicionales if y else
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " es el mayor. ");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " es el mayor. ");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero " + num3 + " es el mayor. ");
        } else {
            System.out.println("Los numeros son iguales. ");
        }
    }
}
