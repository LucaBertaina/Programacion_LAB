/*
Ejercicio 9: Calcular el precio final con descuentos
Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.

**Instrucciones**:
- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.
 */
public class ejercicio9 {
    public static void main(String[]args){
        int[]preciosOriginales={130,210,480,330,640};
        System.out.println("Precios Originales: ");
        for (int i=0;i<preciosOriginales.length;i++){
            System.out.println("$"+preciosOriginales[i]);
        }
        calcularPrecioFinal(preciosOriginales);
    }
    public static void calcularPrecioFinal(int[]preciosOriginales){
        System.out.println("Precios finales con 10% de descuento: ");
        for (int i=0;i<preciosOriginales.length;i++){
            double desc=preciosOriginales[i]*0.1;
            System.out.println("$"+(preciosOriginales[i]-desc));
        }
    }
}
