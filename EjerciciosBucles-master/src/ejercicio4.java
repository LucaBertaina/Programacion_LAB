/*
Ejercicio 4: Registro de ventas diarias
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
Instrucciones:
•	Usa un bucle para registrar las ventas diarias durante 7 días.
•	Al final del bucle, muestra el total de ventas de la semana.
 */
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int dia=1,lun=0,mar=0,mier=0,jue=0,vie=0,sab=0,dom=0,total;
        do {
            switch (dia) {
                case 1:
                    System.out.println("Ingrese las ventas del día "+dia+": ");
                    lun=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Ingrese las ventas del día "+dia+": ");
                    mar=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese las ventas del día "+dia+": ");
                    mier=sc.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese las ventas del día "+dia+": ");
                    jue=sc.nextInt();
                    break;
                case 5:
                    System.out.println("Ingrese las ventas del día "+dia+": ");
                    vie=sc.nextInt();
                    break;
                case 6:
                    System.out.println("Ingrese las ventas del día "+dia+": ");
                    sab=sc.nextInt();
                    break;
                case 7:
                    System.out.println("Ingrese las ventas del día "+dia+": ");
                    dom=sc.nextInt();
                    break;
            }
            dia++;
        }while (dia<=7);
        total=lun+mar+mier+jue+vie+sab+dom;
        System.out.println("Las ventas totales de la semana fueron: "+total);
    }
}