
package Vista;

import Modelo.Ejercicio_06;
import java.util.Scanner;

public class Main_006 {

    public static void main(String[] args) {
        // Título del programa
        System.out.println("==== Programa para determinar la presion y la temperatura: ");
        
        // Llamar la clase Scanner para solicitar la presón y la temperatura
        Scanner teclado = new Scanner(System.in);
        
        // Ingresar datos
        System.out.print("Ingresar la presion: ");
        double presion = teclado.nextDouble();
        
        System.out.print("Ingresar la temperatura: ");
        double temperatura = teclado.nextDouble();
        
        // Crear objeto de la clase ejercicio_06
        Ejercicio_06 resultado = new Ejercicio_06();
        resultado.clima(presion, temperatura);
    }
}
