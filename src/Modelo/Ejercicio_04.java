// 4. Cálculo de áreas - Elige una figura geométrica:" Triángulo y Círculo
// ¿Qué figura quiere calcular (Escriba T o C)?
// Triangulo = base * altura / 2
// Circulo = PI * radio* radio
package Modelo;

public class Ejercicio_04 {
    public void calcularTriangulo(double base, double altura) { // Crear método para calcular área triángulo
               
            // Calcular el área del triágulo base * altura / 2
            double areaTriangulo = base * altura / 2;
            
            System.out.println("--- Calcular Area del Triangulo ---");
            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);
            System.out.println("El area del Triangulo es: " + areaTriangulo);
        
        }
    public void calcularRadio(double radio) { // Crear método para calcular área radio
        
            // Cálculo del área del Círculo: PI * radio * radio
            // Se usa Math.PI para obtener el valor de PI
            double areaCirculo = Math.PI * radio * radio;
            
            System.out.println("--- Calcular de Area del Circulo ---");
            System.out.println("Radio: " + radio);
            System.out.println("El Area del Circulo es: " + areaCirculo);
    }   
}
