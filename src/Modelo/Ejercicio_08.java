// 8. En cierta empresa se les paga a sus trabajadores de la siguiente forma: si el empleado es de
// planta, la hora trabajada se le paga a $20000, si el empleado es administrativo, la hora trabajada
// se le paga a $10000. Para calcular su pago es necesario conocer el total de horas trabajadas.

package Modelo;

public class Ejercicio_08 {

    public static double calcularPago(String tipoEmpleado, int horasTrabajadas) {
        double tarifaPorHora = 0.0;

        // Determinar la tarifa por hora según el tipo de empleado
        if (tipoEmpleado.equalsIgnoreCase("planta")) {
            tarifaPorHora = 20000;
        } else if (tipoEmpleado.equalsIgnoreCase("administrativo")) {
            tarifaPorHora = 10000;
        }

        // Calcular y retornar el pago total
        return tarifaPorHora * horasTrabajadas;
    }
}
