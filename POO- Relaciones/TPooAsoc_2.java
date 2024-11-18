import java.util.ArrayList;
import java.util.Scanner;

class Ingrediente {
    String nombre;
    double cantidad;
    String unidadMedida;

    public Ingrediente(String nombre, double cantidad, String unidadMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }
}

class Plato {
    String nombreCompleto;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void imprimirPlato() {
        System.out.println("Plato: " + nombreCompleto + " - Precio: $" + precio);
        if (!esBebida) {
            System.out.println("Ingredientes:");
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(" - " + ingrediente.nombre + ": " + ingrediente.cantidad + " " + ingrediente.unidadMedida);
            }
        }
    }
}

public class TPooAsoc_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        System.out.print("Ingrese la cantidad de platos: ");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.print("Ingrese el nombre del plato: ");
            String nombrePlato = scanner.nextLine();
            System.out.print("Ingrese el precio del plato: ");
            double precio = scanner.nextDouble();
            System.out.print("¿Es una bebida? (true/false): ");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine();

            Plato plato = new Plato(nombrePlato, precio, esBebida);

            if (!esBebida) {
                System.out.print("Ingrese la cantidad de ingredientes: ");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine();

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.print("Ingrese el nombre del ingrediente: ");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    double cantidad = scanner.nextDouble();
                    System.out.print("Ingrese la unidad de medida: ");
                    scanner.nextLine();
                    String unidadMedida = scanner.nextLine();

                    plato.agregarIngrediente(new Ingrediente(nombreIngrediente, cantidad, unidadMedida));
                }
            }
            platosMenu.add(plato);
        }

        System.out.println("\nMENÚ");
        for (Plato plato : platosMenu) {
            plato.imprimirPlato();
            System.out.println();
        }
    }
}
