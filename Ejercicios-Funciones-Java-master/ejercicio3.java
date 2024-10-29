/*
Ejercicio 3: Gestión de clientes
Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.

**Instrucciones**:
- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
 */
public class ejercicio3 {
    public static void main(String[]args){
        String[]clientes={"Mecha","Enzo","Marcos","Facu"};
        int[]facturasPendientes={450,5000,501,600};
        enviarFacturas(clientes,facturasPendientes);
    }
    public static void enviarFacturas(String[]clientes,int[]facturasPendientes){
        System.out.println("Clientes con facturas pendientes mayores a $500: ");
        for(int i=0;i<clientes.length;i++){
            if (facturasPendientes[i]>500){
                System.out.println(clientes[i]);
            }
        }
    }
}