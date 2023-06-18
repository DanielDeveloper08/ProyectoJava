package Arreglos;

import java.util.Scanner;

public class AplicacionArreglo {

    private String[] nombres;
    private int tamaño;
    private Scanner scanner;

    public AplicacionArreglo(int capacidad) {
        nombres = new String[capacidad];
        tamaño = 0;
        scanner = new Scanner(System.in);
    }

    public void insertarMascota() {
        if (tamaño < nombres.length) {
            System.out.println("Ingrese el nombre de la mascota:");
            String nombre = scanner.nextLine();
            nombres[tamaño] = nombre;
            tamaño++;
            System.out.println("Mascota agregada con exito.");
        } else {
            System.out.println("No se pueden agregar mas mascotas. El arreglo esta lleno.");
        }
    }

    public void mostrarMascotas() {
        System.out.println("Lista de mascotas:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }

    public void eliminarMascota() {
        System.out.println("Ingrese la posicion de la mascota a eliminar:");
        int posicionEliminar = scanner.nextInt();
        scanner.nextLine();
        posicionEliminar = posicionEliminar - 1;
        if (posicionEliminar >= 0 && posicionEliminar < tamaño) {
            for (int i = posicionEliminar; i < tamaño - 1; i++) {
                nombres[i] = nombres[i + 1];
            }
            tamaño--;
            System.out.println("Mascota eliminada con exito.");
        } else {
            System.out.println("Posicion invalida. No se pudo eliminar la mascota.");
        }
    }

    public void actualizarMascota() {
        System.out.println("Ingrese la posicion de la mascota a actualizar:");
        int posicionActualizar = scanner.nextInt();
        scanner.nextLine();

        posicionActualizar = posicionActualizar - 1;

        if (posicionActualizar >= 0 && posicionActualizar < tamaño) {
            System.out.println("Ingrese el nuevo nombre de la mascota:");
            String nuevoNombre = scanner.nextLine();
            nombres[posicionActualizar] = nuevoNombre;
            System.out.println("Mascota actualizada con exito.");
        } else {
            System.out.println("Posicion invalida. No se pudo actualizar la mascota.");
        }
    }

    public boolean retornar() {
        return true;
    }

    public boolean ejecutar() {
        boolean retornar = false;
        int opcion;
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Insertar mascota");
            System.out.println("2. Mostrar mascotas");
            System.out.println("3. Eliminar mascota");
            System.out.println("4. Actualizar mascota");
            System.out.println("0. Retornar");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de linea

            switch (opcion) {
                case 1:
                    insertarMascota();
                    break;

                case 2:
                    mostrarMascotas();
                    break;

                case 3:
                    eliminarMascota();
                    break;

                case 4:
                    actualizarMascota();
                    break;

                case 0:
                    retornar = retornar();

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
        return retornar;
    }
}
