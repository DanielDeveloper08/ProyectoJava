package Busqueda;

import java.util.Arrays;
import java.util.Scanner;


public class AplicacionBusqueda {
    
    private int[] numeros;
    private int tamaño;
    private Scanner scanner;

    public AplicacionBusqueda(int capacidad) {
        numeros = new int[capacidad];
        tamaño = 0;
        scanner = new Scanner(System.in);
    }

    public void insertarNumero() {
        if (tamaño < numeros.length) {
            System.out.println("Ingrese un número:");
            int numero = scanner.nextInt();
            numeros[tamaño] = numero;
            tamaño++;
            System.out.println("Número agregado con éxito.");
        } else {
            System.out.println("No se pueden agregar más números. El arreglo está lleno.");
        }
    }

    public void mostrarNumeros() {
        System.out.println("Lista de números:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + ". " + numeros[i]);
        }
    }

    public void eliminarNumero() {
        System.out.println("Ingrese la posición del número a eliminar:");
        int posicionEliminar = scanner.nextInt();
        scanner.nextLine();
        posicionEliminar = posicionEliminar - 1;
        if (posicionEliminar >= 0 && posicionEliminar < tamaño) {
            for (int i = posicionEliminar; i < tamaño - 1; i++) {
                numeros[i] = numeros[i + 1];
            }
            tamaño--;
            System.out.println("Número eliminado con éxito.");
        } else {
            System.out.println("Posición inválida. No se pudo eliminar el número.");
        }
    }

    public void ordenarBurbuja() {
        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado por burbuja: " + Arrays.toString(numeros));
    }

    public void ordenarSeleccion() {
        for (int i = 0; i < tamaño - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < tamaño; j++) {
                if (numeros[j] < numeros[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = numeros[indiceMinimo];
            numeros[indiceMinimo] = numeros[i];
            numeros[i] = temp;
        }
        System.out.println("Arreglo ordenado por selección: " + Arrays.toString(numeros));
    }

    public void ordenarInsercion() {
        for (int i = 1; i < tamaño; i++) {
            int valorActual = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > valorActual) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = valorActual;
        }
        System.out.println("Arreglo ordenado por inserción: " + Arrays.toString(numeros));
    }

    public void ordenarQuicksort(int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particionar(inicio, fin);
            ordenarQuicksort(inicio, indicePivote - 1);
            ordenarQuicksort(indicePivote + 1, fin);
        }
    }

    private int particionar(int inicio, int fin) {
        int pivote = numeros[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (numeros[j] <= pivote) {
                i++;
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
        int temp = numeros[i + 1];
        numeros[i + 1] = numeros[fin];
        numeros[fin] = temp;
        return i + 1;
    }

    public boolean retornar() {
        return true;
    }

    public boolean ejecutar() {
        boolean retornar = false;
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar números");
            System.out.println("3. Eliminar número");
            System.out.println("4. Ordenar por burbuja");
            System.out.println("5. Ordenar por selección");
            System.out.println("6. Ordenar por inserción");
            System.out.println("7. Ordenar por Quicksort");
            System.out.println("0. Retornar");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    insertarNumero();
                    break;

                case 2:
                    mostrarNumeros();
                    break;

                case 3:
                    eliminarNumero();
                    break;

                case 4:
                    ordenarBurbuja();
                    break;

                case 5:
                    ordenarSeleccion();
                    break;

                case 6:
                    ordenarInsercion();
                    break;

                case 7:
                    ordenarQuicksort(0, tamaño - 1);
                    System.out.println("Arreglo ordenado por Quicksort: " + Arrays.toString(numeros));
                    break;

                case 0:
                    retornar = retornar();

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
        return retornar;
    }
}
