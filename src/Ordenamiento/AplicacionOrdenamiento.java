package Ordenamiento;

import java.util.Scanner;


public class AplicacionOrdenamiento {


    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos a ordenar: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los elementos:");

        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        seleccionarMetodoOrdenamiento(arreglo);
        
    }

    public static void seleccionarMetodoOrdenamiento(int[] arreglo) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Intercambio directo (Burbuja)");
        System.out.println("2. Selección");
        System.out.println("3. Inserción");
        System.out.println("4. Quicksort");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                int[] arregloBurbuja = arreglo.clone();
                burbuja(arregloBurbuja);
                System.out.println("Arreglo ordenado por intercambio directo (Burbuja):");
                imprimirArreglo(arregloBurbuja);
                break;
            case 2:
                int[] arregloSeleccion = arreglo.clone();
                seleccion(arregloSeleccion);
                System.out.println("Arreglo ordenado por selección:");
                imprimirArreglo(arregloSeleccion);
                break;
            case 3:
                int[] arregloInsercion = arreglo.clone();
                insercion(arregloInsercion);
                System.out.println("Arreglo ordenado por inserción:");
                imprimirArreglo(arregloInsercion);
                break;
            case 4:
                int[] arregloQuicksort = arreglo.clone();
                quicksort(arregloQuicksort, 0, arregloQuicksort.length - 1);
                System.out.println("Arreglo ordenado por Quicksort:");
                imprimirArreglo(arregloQuicksort);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                seleccionarMetodoOrdenamiento(arreglo);
        }
    }

    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void seleccion(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arreglo[minIdx];
            arreglo[minIdx] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    public static void insercion(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 1; i < n; i++) {
            int key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            arreglo[j + 1] = key;
        }
    }

    public static void quicksort(int[] arreglo, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arreglo, low, high);
            quicksort(arreglo, low, pivotIdx - 1);
            quicksort(arreglo, pivotIdx + 1, high);
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

    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
