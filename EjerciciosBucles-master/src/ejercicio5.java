/*
Ejercicio 5: Cálculo de horas extras
Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
Instrucciones:
•	Pide al usuario ingresar el número de empleados.
•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
*/
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cantEmpleados,i,horas,horasExtra;
        i=1;
        System.out.println("Ingrese la cantidad de empleados: ");
        cantEmpleados=sc.nextInt();
        while (i<=cantEmpleados){
            System.out.println("Ingrese las horas semanales trabajadas del empleado "+i+": ");
            horas=sc.nextInt();
            horasExtra=horas-40;
            if (horas>40){
                System.out.println("El empleado "+i+" trabajó horas extra. Horas extra trabajadas: "+horasExtra);
            }
            i++;
        }
    }
}