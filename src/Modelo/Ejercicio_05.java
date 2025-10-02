// 5. Escriba un algoritmo que calcule el área de un rectángulo siempre y cuando los lados sean
// positivos: área triangulo = lado * lado.
package Modelo;


public class Ejercicio_05 {
    public void areaRectangulo(double lado1, double lado2) {
         
        // Determinar los lados positivos del triángulo
        if (lado1 > 0 && lado2 > 0) {
            double areaRectangulo = lado1 * lado2;
            
            System.out.println("==== Calcular de area del Rectangulo ====");
            System.out.println("Lado 1: " + lado1);
            System.out.println("Lado 2: " + lado2);
            System.out.println("El area del Rectangulo es: " + areaRectangulo);
        } else {
            System.out.println("Error: los lados deben ser positivos. ");
        }
    }   
}
