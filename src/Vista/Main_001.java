package Vista;
import Modelo.Ejercicio_01;
import java.util.Scanner;


public class Main_001 {

    public static void main(String[] args) {
        // Título de la entrada
        System.out.println("=====Programa para determinar un numero positivo menor que 100===== ");
        
        // Llamar la clase Scanner para solicitar al usuario ingresar el número
        Scanner teclado = new Scanner(System.in);
        
        // Ingresar datos
        System.out.print("Ingresar un numero positivo menor que 100: ");
        int num1 = teclado.nextInt();
        
        // Crear objeto de la clase ejercicio_01
        Ejercicio_01 resultado = new Ejercicio_01();
        resultado.numeroPositivo(num1); // Llamar al método numeroPositivo con un número de prueba
    }
}
