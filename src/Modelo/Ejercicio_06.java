// 6. Considere dos variables llamadas temperatura y presión. Escriba una sentencia if-else que
// muestre en pantalla la palabra Alarma si la variable presión es mayor a 200 o si la variable
// temperatura es mayor a 100. En caso contrario, se debe mostrar en pantalla la palabra Normal.
package Modelo;

public class Ejercicio_06 {
    public void clima(double presion, double temperatura) {
        
        // Determinar el tipo de clima
        if (presion > 200 && temperatura > 100) {
            
            System.out.println("=== Alarma === ");
        } else {
            System.out.println("=== Normal === ");
        }
    }
}
