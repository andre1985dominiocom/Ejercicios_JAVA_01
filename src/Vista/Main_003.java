
package Vista;

import Modelo.Ejercicio_03;
import java.util.Scanner;


public class Main_003 {

    
    public static void main(String[] args) {
        
        // Título de la entrada
        System.out.println("=====Programa para identificar el mayor, el menor o la igualdad de tres numeros===== ");
        
        // Llamar la clase Scanner para solcitar al usuario el ingreso de números
        Scanner entrada = new Scanner(System.in);
        
        // Ingresar valores por teclado
        System.out.print("Ingresar el primer valor: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Ingresar el segundo valor: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Ingresar el tercer valor: ");
        int num3 = entrada.nextInt();
        
        // Crear objeto de la clase ejercicio_03
        Ejercicio_03 resultado = new Ejercicio_03();
        resultado.valoresNumericos(num1, num2, num3);
        
    }
}
