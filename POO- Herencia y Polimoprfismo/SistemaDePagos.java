import java.util.ArrayList;

abstract class MetodoPago {
    String titular;
    String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago();
}

interface Cancelable {
    void cancelarPago();
}

class TarjetaCredito extends MetodoPago implements Cancelable {
    String fechaExpiracion;
    int codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con Tarjeta de Crédito de " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago cancelado con Tarjeta de Crédito de " + titular);
    }
}

class PayPal extends MetodoPago implements Cancelable {
    String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con PayPal de " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago cancelado con PayPal de " + titular);
    }
}

class Pagos {
    ArrayList<MetodoPago> metodosPago = new ArrayList<>();

    public void agregarMetodoPago(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
    }

    public void realizarPagos() {
        for (MetodoPago metodoPago : metodosPago) {
            metodoPago.realizarPago();
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodoPago : metodosPago) {
            if (metodoPago instanceof Cancelable) {
                ((Cancelable) metodoPago).cancelarPago();
            }
        }
    }

    public void mostrarMetodosPago() {
        for (MetodoPago metodoPago : metodosPago) {
            System.out.println("Método de pago: " + metodoPago.getClass().getSimpleName() + " - Titular: " + metodoPago.titular);
        }
    }
}

public class SistemaDePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        TarjetaCredito tarjeta = new TarjetaCredito("Juan Perez", "1234567890123456", "12/25", 123);
        PayPal paypal = new PayPal("Maria Gomez", "paypal-001", "maria@example.com");

        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        pagos.realizarPagos();
        pagos.cancelarPagos();
        pagos.mostrarMetodosPago();
    }
}
