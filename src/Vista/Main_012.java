package Vista;
import Modelo.Ejercicio_12;
import java.util.Scanner;

public abstract class Main_012 {
    public static void main(String[] args) {
        // Título de la entrada
        System.out.println("==== Programa para restar dos números si el primero es mayor que el segundo ====");
        Scanner teclado = new Scanner(System.in);
     
        // Resultados
        System.out.print("Ingresar el primer número: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Ingresar el segundo número: ");
        int num2 = teclado.nextInt();
         
        // Llamar al método y mostrar el resultado
        String resultado = Ejercicio_12.restarSiMayor(num1, num2);
        System.out.println(resultado);
    }
}
