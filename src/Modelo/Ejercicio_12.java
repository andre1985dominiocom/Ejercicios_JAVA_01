// 12. Restarle al primer número al segundo (siempre y cuando el primero sea mayor que él segundo,
// en caso contrario indicar con un mensaje que la operación no es posible realizarla.
package Modelo;

public class Ejercicio_12 {
    public static String restarSiMayor(int num1, int num2) { // Crear método para restar el número mayor
        if (num1 > num2) {
            int resultado = num1 - num2;
            return ("El resultado de la resta es: " + resultado);
        } else {
            return ("Operación no posible: el primer número no es mayor que el segundo.");
        }
    }
}
