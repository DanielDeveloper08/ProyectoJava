package Busqueda;

import java.util.Arrays;

public class PruebaEscritorioBusqueda {

    public void ejecutarPrueba() {
        int[] arreglo = {1, 3, 5, 7, 9, 11};
        int elemento = 7;

        System.out.println("\n**********************************************\n");
        System.out.println("Entrada:");
        System.out.println("- Arreglo: " + Arrays.toString(arreglo));
        System.out.println("- Elemento a buscar: " + elemento);

        System.out.println("\nPrueba de Escritorio - Busqueda Secuencial:");

        int indiceSecuencial = busquedaSecuencial(arreglo, elemento);

        System.out.println("\nSalida:");
        if (indiceSecuencial != -1) {
            System.out.println("- Elemento encontrado en el indice: " + indiceSecuencial);
        } else {
            System.out.println("- Elemento no encontrado");
        }

        System.out.println("\nPrueba de Escritorio - Busqueda Binaria:");

        int indiceBinario = busquedaBinaria(arreglo, elemento);

        System.out.println("\nSalida:");
        if (indiceBinario != -1) {
            System.out.println("- Elemento encontrado en el indice: " + indiceBinario);
        } else {
            System.out.println("- Elemento no encontrado");
        }
    }

    public static int busquedaSecuencial(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            int valorActual = arreglo[i];
            System.out.println("\nIteracion " + (i + 1) + ":");
            System.out.println("- Valor actual: " + valorActual);
            System.out.println("- Elemento a buscar: " + elemento);

            if (valorActual == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int left = 0;
        int right = arreglo.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int valorActual = arreglo[mid];

            System.out.println("\nIteracion:");
            System.out.println("- Left: " + left);
            System.out.println("- Right: " + right);
            System.out.println("- Mid: " + mid);
            System.out.println("- Valor actual: " + valorActual);
            System.out.println("- Elemento a buscar: " + elemento);

            if (valorActual == elemento) {
                return mid;
            }

            if (valorActual < elemento) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
