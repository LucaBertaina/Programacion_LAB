/*
 Ejercicio 6: Cálculo de impuestos
Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.

**Instrucciones**:
- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
 */
public class ejercicio6 {
    public static void main(String[]args) {
        int[]facturas={200,50,1000,600,800};
        calcularImpuesto(facturas);
    }
    public static void calcularImpuesto(int[]facturas){
        double imp;
        for (int i=0;i<facturas.length;i++){
            imp = (double) facturas[i] + (facturas[i] * 0.21);
            System.out.println("Factura del cliente "+(i+1)+"con impuestos: "+imp);
        }
    }
}
