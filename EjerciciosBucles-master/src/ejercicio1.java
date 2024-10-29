/*
Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Instrucciones:
•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
 */
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] actividades = {"estudiar", "hacer ejercicio", "leer", "su tiempo libre"};
        int total=0;

        for (String actividad:actividades){
            System.out.println("Ingrese las horas dedicadas a "+actividad+": ");
            int horas=sc.nextInt();
            total += horas;
        }

        System.out.println("Su tiempo total dedicado es de "+total+" horas.");
    }
}