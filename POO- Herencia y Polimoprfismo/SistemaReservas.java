import java.util.ArrayList;

abstract class Vuelo {
    String numeroVuelo;
    String origen;
    String destino;
    String fecha;

    public Vuelo(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();
}

interface Promocionable {
    void aplicarPromocion();
}

class VueloRegular extends Vuelo implements Promocionable {
    int numeroAsientos;
    double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return precioBasePorAsiento * numeroAsientos;
    }

    @Override
    public void aplicarPromocion() {
        precioBasePorAsiento *= 0.9; // Aplica un descuento del 10%
    }
}

class VueloCharter extends Vuelo implements Promocionable {
    double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        precioTotal *= 0.85; // Aplica un descuento del 15%
    }
}

class Reservas {
    ArrayList<Vuelo> vuelos = new ArrayList<>();

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("Vuelo: " + vuelo.numeroVuelo + " de " + vuelo.origen + " a " + vuelo.destino + " en fecha " + vuelo.fecha);
            System.out.println("Precio: $" + vuelo.calcularPrecio());
            System.out.println();
        }
    }
}

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vuelo1 = new VueloRegular("V123", "Buenos Aires", "Madrid", "2024-12-15", 150, 200);
        VueloCharter vuelo2 = new VueloCharter("C456", "New York", "Paris", "2024-12-20", 50000);

        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

        reservas.aplicarPromociones();
        reservas.mostrarVuelos();
        System.out.println("Precio total de todas las reservas: $" + reservas.calcularPrecioTotal());
    }
}
