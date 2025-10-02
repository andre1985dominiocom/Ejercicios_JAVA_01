package Vista;
import Modelo.Ejercicio_12;

public abstract class Main_012 {
    public static void main(String[] args) {
        // Título de la entrada
        System.out.println("==== Programa para restar dos números si el primero es mayor que el segundo ====");

        // Ejemplo de uso del método restarSiMayor
        int num1 = 30; // Primer número
        int num2 = 20;  // Segundo número

        // Llamar al método y mostrar el resultado
        String resultado = Ejercicio_12.restarSiMayor(num1, num2);
        System.out.println(resultado);
    }

}
