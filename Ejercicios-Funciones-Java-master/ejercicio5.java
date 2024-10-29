/*
 Ejercicio 5: Promedio de satisfacción del cliente
Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.

**Instrucciones**:
- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.
 */
public class ejercicio5 {
    public static void main(String[]args){
        double promedio;
        int[]calificaciones={1,2,5,3,2};
        promedio=calcularPromedioSatisfaccion(calificaciones);
        System.out.println("Promedio de calificaciones: "+promedio);
    }
    public static double calcularPromedioSatisfaccion(int[]calificaciones){
        int total=0;
        double promedio;
        for (int i=0;i<calificaciones.length;i++){
            total+=calificaciones[i];
        }
        promedio= (double) total/calificaciones.length;
        return promedio;
    }
}