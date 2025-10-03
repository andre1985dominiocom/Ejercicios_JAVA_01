package Vista;
import Modelo.Ejercicio_02;
import java.util.Scanner;

public abstract class Main_002 {
    public static void main(String[] args) {

        // Título de la entrada
        System.out.println("=====Programa para determinar el mayor de tres numeros diferentes===== ");
        
        // Llamar la clase Scanner para solicitar al usuario ingresar números
        Scanner teclado = new Scanner(System.in);
        
        // Ingresar datos
        System.out.print("Ingresar el primer numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Ingresar el segundo numero: ");
        int num2 = teclado.nextInt();
        
        System.out.print("Ingresar el tercer numero: ");
        int num3 = teclado.nextInt();
        
        // Crear objeto de la clase ejercicio_02
        Ejercicio_02 resultado = new Ejercicio_02();
        resultado.numeroMayor(num1, num2, num3); // Llamar al método numeroMayor 
    }
}
