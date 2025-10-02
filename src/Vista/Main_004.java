
package Vista;

import java.util.Scanner;
import Modelo.Ejercicio_04;

public class Main_004 {

    public static void main(String[] args) {
        
        // Título de la entrada
        System.out.println("==== Programa para calcular una figura geometrica ===== ");
        
        // Llamar la clase Scanner para solicitar al usuario el ingreso las variables
        Scanner teclado = new Scanner(System.in);
         
        // Ingresar los datos
        
        System.out.print("Ingresar la figura a calcular (T = Triangulo o C = Circulo): ");
        String figura = teclado.next().toUpperCase();
        
        // Crear objeto de la clase ejercicio_04 del método calcularTriangulo
        Ejercicio_04  calculadora = new Ejercicio_04();
        
        // Definir condicionates
        if (figura.equals("T")) {
            System.out.print("Ingresar la base: ");
            double base = teclado.nextDouble();
            
            System.out.print("Ingresar la altura: ");
            double altura = teclado.nextDouble();
             
            calculadora.calcularTriangulo(base, altura);
        } else if (figura.equals("C")) {
            System.out.print("Ingresar el radio: ");
            double radio = teclado.nextDouble();
            
            calculadora.calcularRadio(radio);
        } else {
            System.out.println("Opcion no valida. Por favor ingresar T o C: ");
        }
        
        teclado.close();
    }
}
