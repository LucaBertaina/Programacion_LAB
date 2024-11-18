import java.util.ArrayList;
import java.util.Scanner;

class DetalleFactura {
    String codigoArticulo;
    String nombreArticulo;
    int cantidad;
    double precioUnitario;
    double descuentoItem;
    double subtotal;

    public DetalleFactura(String codigoArticulo, String nombreArticulo, int cantidad, double precioUnitario, double descuentoItem, double subtotal) {
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuentoItem = descuentoItem;
        this.subtotal = subtotal;
    }
}

class Factura {
    String fechaFactura;
    long numeroFactura;
    double totalCalculadoFactura;
    String cliente;
    ArrayList<DetalleFactura> detallesFactura;

    public Factura() {
        this.detallesFactura = new ArrayList<>();
    }

    public void calcularMontoTotal() {
        totalCalculadoFactura = 0;
        for (DetalleFactura detalle : detallesFactura) {
            totalCalculadoFactura += detalle.subtotal;
        }
    }
}

public class TPooAsoc_3 {
    static String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        System.out.print("Ingrese la fecha de la factura: ");
        factura.fechaFactura = scanner.nextLine();
        System.out.print("Ingrese el número de factura: ");
        factura.numeroFactura = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        factura.cliente = scanner.nextLine();

        while (true) {
            System.out.print("Ingrese el código del artículo a facturar (o '0' para terminar): ");
            String codigo = scanner.nextLine();
            if (codigo.equals("0")) break;

            String[] articulo = buscarArticulo(codigo);
            if (articulo == null) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
                continue;
            }

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            double precioUnitario = Double.parseDouble(articulo[2]);
            double descuentoItem = cantidad > 5 ? precioUnitario * 0.1 : 0;
            double subtotal = (precioUnitario - descuentoItem) * cantidad;

            DetalleFactura detalle = new DetalleFactura(codigo, articulo[1], cantidad, precioUnitario, descuentoItem, subtotal);
            factura.detallesFactura.add(detalle);
        }

        factura.calcularMontoTotal();

        System.out.println("\nFactura:");
        System.out.println("Fecha: " + factura.fechaFactura);
        System.out.println("Número: " + factura.numeroFactura);
        System.out.println("Cliente: " + factura.cliente);
        System.out.println("Detalles:");
        for (DetalleFactura detalle : factura.detallesFactura) {
            System.out.printf("Código: %s, Nombre: %s, Cantidad: %d, Precio Unitario: %.2f, Descuento: %.2f, Subtotal: %.2f\n",
                    detalle.codigoArticulo, detalle.nombreArticulo, detalle.cantidad, detalle.precioUnitario, detalle.descuentoItem, detalle.subtotal);
        }
        System.out.println("Total: " + factura.totalCalculadoFactura);
    }

    public static String[] buscarArticulo(String codigo) {
        for (String[] articulo : articulos) {
            if (articulo[0].equals(codigo)) return articulo;
        }
        return null;
    }
}
