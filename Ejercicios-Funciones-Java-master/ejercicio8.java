/*
 Ejercicio 8: Control de horas trabajadas
Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.

**Instrucciones**:
- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).
 */
public class ejercicio8{
    public static void main(String[]args){
        String[]empleados={"Mecha","Enzo","Facu","Marcos","Gabi"};
        int[]horasTrabajadas={40,28,30,50,70};
        calcularPagoSemanal(empleados,horasTrabajadas);
    }
    public static void calcularPagoSemanal(String[]empleados,int[]horasTrabajadas){
        System.out.println("Pago semanal de cada empleado: ");
        int pago;
        for (int i=0;i<horasTrabajadas.length;i++){
            pago=horasTrabajadas[i]*15;
            System.out.println(empleados[i]+": $"+pago);
        }
    }
}
