
package Arreglos;

import java.util.Arrays;

public class PruebaEscritorioArreglo {
    
    public void ejecutarPrueba() {
        int[] arreglo = {5, 9, 3, 1, 7};
        String operacion = "Suma";
        int resultado = 0;

        System.out.println("Entrada:");
        System.out.println("- Arreglo: " + Arrays.toString(arreglo));
        System.out.println("- Operacion: " + operacion);

        System.out.println("\nPrueba de Escritorio:");

        System.out.println("1. Inicializacion:");
        System.out.println("   - Arreglo: " + Arrays.toString(arreglo));
        System.out.println("   - Operacion: " + operacion);
        System.out.println("   - Resultado: " + resultado);

        for (int i = 0; i < arreglo.length; i++) {
            int valorActual = arreglo[i];
            System.out.println("\n" + (i + 2) + ". Iteracion " + (i + 1) + ":");
            System.out.println("   - Valor actual del arreglo: " + valorActual);
            System.out.println("   - Operacion: " + operacion);
            resultado += valorActual;
            System.out.println("   - Resultado: " + resultado);
        }

        System.out.println("\n7. Fin del bucle.");

        System.out.println("\nSalida:");
        System.out.println("- Resultado de la operacion: " + resultado);
    }
}
