/*
Ejercicio 1: Cálculo de ingresos mensuales
Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.

**Instrucciones**:
- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
- Imprime el total de ingresos mensuales.
 */
public class ejercicio1 {
    public static void main(String[] args) {
        int ingresosMensuales;
        int[]ventas={200, 150, 250, 300, 100, 500, 450, 120, 130, 220,
                160, 180, 290, 210, 170, 230, 240, 130, 260, 280,
                310, 320, 150, 190, 205, 305, 295, 180, 240, 265};
        ingresosMensuales=calcularIngresosMensuales(ventas);
        System.out.println("Los ingresos mensuales fueron de $"+ingresosMensuales);
    }
    public static int calcularIngresosMensuales(int[] ventas){
        int total=0;
        for (int i : ventas) {
            total += i;
        }
        return total;
    }
}