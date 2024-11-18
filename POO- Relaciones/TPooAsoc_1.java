import java.util.ArrayList;
import java.util.Scanner;

class Nota {
    String catedra;
    double notaExamen;

    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }
}

class Alumno {
    String nombreCompleto;
    long legajo;
    ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.notaExamen;
        }
        return notas.size() > 0 ? suma / notas.size() : 0;
    }

    public void imprimirNotas() {
        System.out.println("Alumno: " + nombreCompleto + " - Legajo: " + legajo);
        for (Nota nota : notas) {
            System.out.println("Cátedra: " + nota.catedra + " - Nota: " + nota.notaExamen);
        }
        System.out.println("Promedio: " + calcularPromedio());
    }
}

public class TPooAsoc_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre completo del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el legajo del alumno: ");
            long legajo = scanner.nextLong();
            scanner.nextLine();

            Alumno alumno = new Alumno(nombre, legajo);

            System.out.print("Ingrese la cantidad de notas: ");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Ingrese la cátedra: ");
                String catedra = scanner.nextLine();
                System.out.print("Ingrese la nota del examen: ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();

                alumno.agregarNota(new Nota(catedra, notaExamen));
            }
            alumnos.add(alumno);
        }

        for (Alumno alumno : alumnos) {
            alumno.imprimirNotas();
            System.out.println();
        }
    }
}
