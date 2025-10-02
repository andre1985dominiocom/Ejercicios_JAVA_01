
package Vista;
import java.util.Scanner;
import Modelo.Ejercicio_05;

public class Main_005 {

    
    public static void main(String[] args) {
        
        // Título del programa
        System.out.println("===== Programa para calcular el area de un rectancgulo ===== ");
        
        // Llamar la clase Scanner para solicitar al usuario el área del rectangulo
        Scanner teclado = new Scanner(System.in);
        
        // Ingresar datos
        System.out.print("Ingresar lado 1: ");
        double lado1 = teclado.nextDouble();
        
        System.out.print("Ingresar lado 2: ");
        double lado2 = teclado.nextDouble();
        
        // Crear objeto de la clase ejercicio_05
        Ejercicio_05 resultado = new Ejercicio_05();
        resultado.areaRectangulo(lado1, lado2);
        
        teclado.close();
    }  
}
