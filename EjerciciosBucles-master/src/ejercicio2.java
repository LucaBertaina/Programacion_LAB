/*
Ejercicio 2: Cálculo de salarios semanales
Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
Instrucciones:
•	Pide al usuario ingresar la cantidad de empleados.
•	Para cada empleado, pide ingresar las horas trabajadas.
•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
 */
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantEmpleados,horas;
        int tarifa=15;
        System.out.println("Ingrese la cantidad de empleados: ");
        cantEmpleados=sc.nextInt();
        for (int i=1;i<=cantEmpleados;i++){
            System.out.println("Ingrese las horas trabajadas del empleado "+i+".");
            horas=sc.nextInt();
            System.out.println("El salario del empleado "+i+" es de $"+horas*tarifa);
        }
    }
}