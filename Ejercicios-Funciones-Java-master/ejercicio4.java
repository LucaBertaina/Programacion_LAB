/*
Ejercicio 4: Cálculo de descuentos para fidelización
Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado. Si han comprado más de 10 veces, reciben un 10% de descuento.

**Instrucciones**:
- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.
 */
public class ejercicio4 {
    public static void main(String[]args){
        String[]clientes={"Gabi","Mecha","Enzo","Facu","Marcos"};
        int[]compras={5,12,1,20,15};
        calcularDescuentos(clientes,compras);
    }
    public static void calcularDescuentos(String[]clientes,int[]compras){
        for (int i=0;i<clientes.length;i++){
            if (compras[i]>10) {
                System.out.println("Descuento de 10% aplicado a "+clientes[i]);
            }
        }
    }
}