/*
 Ejercicio 7: Descuento por compras grandes
Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

**Instrucciones**:
- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
 */
public class ejercicio7 {
    public static void main(String[]args){
        int[]compras={501,499,500,1000,60};
        aplicarDescuento(compras);
    }
    public static void aplicarDescuento(int[]compras){
        double des;
        for (int i=0;i<compras.length;i++){
            if (compras[i]>500) {
                des =(double) compras[i] - compras[i]*0.15;
                System.out.println("Descuento aplicado al cliente "+(i+1)+". Total: "+des);
            }
        }
    }
}
