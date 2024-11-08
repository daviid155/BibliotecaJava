import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Biblioteca {

    // Clase para representar un libro
    static class Libro {
        String codigo;
        String nombre;
        String autor;
        String materia;
        int paginas;

        Libro(String codigo, String nombre, String autor, String materia, int paginas) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.autor = autor;
            this.materia = materia;
            this.paginas = paginas;
        }

        @Override
        public String toString() {
            return "Código: " + codigo + ", Nombre: " + nombre + ", Autor: " + autor + 
                   ", Materia: " + materia + ", Páginas: " + paginas;
        }
    }

    static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Métodos para agregar, actualizar, eliminar, buscar y ordenar libros
    public static void registrarLibro() {
        System.out.print("Ingrese código: ");
        String codigo = scanner.next();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese autor: ");
        String autor = scanner.next();
        System.out.print("Ingrese materia: ");
        String materia = scanner.next();
        System.out.print("Ingrese número de páginas: ");
        int paginas = scanner.nextInt();

        libros.add(new Libro(codigo, nombre, autor, materia, paginas));
        System.out.println("Libro registrado exitosamente.");
    }

    public static void mostrarLibros() {
        System.out.println("Lista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    // Otros métodos para actualizar, eliminar, buscar y ordenar van aquí

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n1. Registrar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarLibro();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}
