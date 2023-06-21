package Ordenamiento;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaEscritorioOrdenamiento {

    public void ejecutarPrueba() {
        int[] arreglo = {5, 9, 3, 1, 7};
        boolean opcionValida = false;

        do {
            System.out.println("\n**********************************************\n");
            System.out.println("Seleccione un tipo de ordenamiento:");
            System.out.println("1. Ordenamiento por Intercambio Directo (Burbuja)");
            System.out.println("2. Ordenamiento por Seleccion");
            System.out.println("3. Ordenamiento por Insercion");
            System.out.println("4. Ordenamiento por Quicksort");

            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    pruebaEscritorioIntercambioDirecto(arreglo);
                    opcionValida = true;
                    break;

                case 2:
                    pruebaEscritorioSeleccion(arreglo);
                    opcionValida = true;
                    break;

                case 3:
                    pruebaEscritorioInsercion(arreglo);
                    opcionValida = true;
                    break;

                case 4:
                    pruebaEscritorioQuicksort(arreglo);
                    opcionValida = true;
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }
        } while (!opcionValida);
    }

    public static int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            try {
                System.out.print("Opción: ");
                opcion = scanner.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    break;
                } else {
                    System.out.println("Opcion invalida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada invalida. Intente nuevamente.");
                scanner.nextLine();
            }
        }

        return opcion;
    }

    public static void pruebaEscritorioIntercambioDirecto(int[] arreglo) {
        int n = arreglo.length;

        System.out.println("\nPrueba de Escritorio - Ordenamiento por Intercambio Directo (Burbuja):");

        System.out.println("1. Inicializacion:");
        System.out.println("   - Arreglo original: " + Arrays.toString(arreglo));

        for (int i = 0; i < n - 1; i++) {
            System.out.println("\n" + (i + 2) + ". Iteracion " + (i + 1) + ":");

            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("   - Comparando " + arreglo[j] + " y " + arreglo[j + 1]);

                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    System.out.println("   - Intercambio realizado. Nuevo arreglo: " + Arrays.toString(arreglo));
                } else {
                    System.out.println("   - No se realiza intercambio.");
                }
            }
        }

        System.out.println("\n" + (n + 1) + ". Fin del ordenamiento.");

        System.out.println("\nSalida:");
        System.out.println("- Arreglo ordenado por Intercambio Directo (Burbuja): " + Arrays.toString(arreglo));
    }

    public static void pruebaEscritorioSeleccion(int[] arreglo) {
        int n = arreglo.length;

        System.out.println("\nPrueba de Escritorio - Ordenamiento por Seleccion:");

        System.out.println("1. Inicializacion:");
        System.out.println("   - Arreglo original: " + Arrays.toString(arreglo));

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            System.out.println("\n" + (i + 2) + ". Iteracion " + (i + 1) + ":");

            for (int j = i + 1; j < n; j++) {
                System.out.println("   - Comparando " + arreglo[j] + " y " + arreglo[minIndex]);

                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[minIndex];
                arreglo[minIndex] = temp;

                System.out.println("   - Intercambio realizado. Nuevo arreglo: " + Arrays.toString(arreglo));
            } else {
                System.out.println("   - No se realiza intercambio.");
            }
        }

        System.out.println("\n" + (n + 1) + ". Fin del ordenamiento.");

        System.out.println("\nSalida:");
        System.out.println("- Arreglo ordenado por Seleccion: " + Arrays.toString(arreglo));
    }

    public static void pruebaEscritorioInsercion(int[] arreglo) {
        int n = arreglo.length;

        System.out.println("\nPrueba de Escritorio - Ordenamiento por Insercion:");

        System.out.println("1. Inicializacion:");
        System.out.println("   - Arreglo original: " + Arrays.toString(arreglo));

        for (int i = 1; i < n; i++) {
            int key = arreglo[i];
            int j = i - 1;

            System.out.println("\n" + (i + 1) + ". Iteracion " + i + ":");

            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j--;

                System.out.println("   - Moviendo " + arreglo[j + 1] + " a la derecha. Nuevo arreglo: " + Arrays.toString(arreglo));
            }

            arreglo[j + 1] = key;

            System.out.println("   - Insertando " + key + ". Nuevo arreglo: " + Arrays.toString(arreglo));
        }

        System.out.println("\n" + (n + 1) + ". Fin del ordenamiento.");

        System.out.println("\nSalida:");
        System.out.println("- Arreglo ordenado por Insercion: " + Arrays.toString(arreglo));
    }

    public static void pruebaEscritorioQuicksort(int[] arreglo) {
        int n = arreglo.length;

        System.out.println("\nPrueba de Escritorio - Ordenamiento por Quicksort:");

        System.out.println("1. Inicializacion:");
        System.out.println("   - Arreglo original: " + Arrays.toString(arreglo));

        quicksort(arreglo, 0, n - 1);

        System.out.println("\n" + (n + 1) + ". Fin del ordenamiento.");

        System.out.println("\nSalida:");
        System.out.println("- Arreglo ordenado por Quicksort: " + Arrays.toString(arreglo));
    }

    public static void quicksort(int[] arreglo, int low, int high) {
        if (low < high) {
            int pi = partition(arreglo, low, high);

            System.out.println("\nParticion realizada. Pivote: " + arreglo[pi] + ". Nuevo arreglo: " + Arrays.toString(arreglo));

            quicksort(arreglo, low, pi - 1);
            quicksort(arreglo, pi + 1, high);
        }
    }

    public static int partition(int[] arreglo, int low, int high) {
        int pivot = arreglo[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arreglo[j] < pivot) {
                i++;

                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[high];
        arreglo[high] = temp;

        return i + 1;
    }
}
