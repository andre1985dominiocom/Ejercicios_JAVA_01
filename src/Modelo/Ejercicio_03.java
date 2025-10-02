// 3. Desarrollar un diagrama que lea 3 valores diferentes e indique cual es el mayor de ellos, el menor
// o si son iguales.
package Modelo;

public class Ejercicio_03 {
    public void valoresNumericos(int num1,  int num2, int num3) { // Crear método de la clase ejercicio_03
        
        // Determinar si todos los números son iguales
        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos los numeros son iguales. ");
        }   else { // Determinar el número mayor
            if (num1 >= num2 && num1 >= num3){
            System.out.println("El numero " + num1 + " es el mayor. ");
        }   else if (num2 >= num1 && num2 >= num3){
            System.out.println("El numero " + num2 + " es el mayor. ");
        }   else {
            System.out.println("El numero " + num3 + " es el mayor. ");    
        } 
        // Determinar el menor número
            if (num1 <= num2 && num1 <= num3){
            System.out.println("El numero " + num1 + " es el menor. ");
        }   else if (num2 <= num1 && num2 <= num3){
            System.out.println("El numero " + num2 + " es el menor. ");
        }   else {
            System.out.println("El numero " + num3 + " es el menor. ");
        }
      }
    }
}
