package Recursividad_Iteracion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaEscritorioRecursividadIteracion {
    private Scanner scanner = new Scanner(System.in);;


    public void ejecutarPrueba() {
        boolean opcionValida;
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            opcionValida = true;

            switch (opcion) {
                case 1:
                    mostrarPruebaEscritorioIteracion();
                    break;
                case 2:
                    mostrarPruebaEscritorioRecursividad();
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    opcionValida = false;
                    break;
            }
        } while (!opcionValida);

    }

    private void mostrarMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Prueba de Escritorio - Iteracion");
        System.out.println("2. Prueba de Escritorio - Recursividad");
    }

    private int leerOpcion() {
        while (true) {
            try {
                System.out.print("Seleccione una opcion: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                return opcion;
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada invalida. Intente nuevamente.");
                scanner.nextLine(); // Consumir la entrada incorrecta
            }
        }
    }

    private void mostrarPruebaEscritorioIteracion() {
        int numero = 5;
        int resultado = 1;

        System.out.println("\nPrueba de Escritorio - Iteracion:");

        System.out.println("1. Inicializacion:");
        System.out.println("   - Numero: " + numero);
        System.out.println("   - Resultado: " + resultado);

        for (int i = 1; i <= numero; i++) {
            int numeroActual = i;
            resultado *= numeroActual;
            System.out.println("\n" + (i + 1) + ". Iteracion " + i + ":");
            System.out.println("   - Numero actual: " + numeroActual);
            System.out.println("   - Resultado parcial: " + resultado);
        }

        System.out.println("\n" + (numero + 2) + ". Fin del bucle.");

        System.out.println("\nSalida:");
        System.out.println("- Resultado del factorial de " + numero + ": " + resultado);
    }

    private void mostrarPruebaEscritorioRecursividad() {
        int numero = 5;
        int resultado = calcularFactorialRecursivo(numero);

        System.out.println("\nPrueba de Escritorio - Recursividad:");

        System.out.println("1. Inicializacion:");
        System.out.println("   - Numero: " + numero);
        System.out.println("   - Resultado: " + resultado);

        calcularFactorialRecursivo(1, numero);

        System.out.println("\n" + (numero + 2) + ". Fin de la recursion.");

        System.out.println("\nSalida:");
        System.out.println("- Resultado del factorial de " + numero + ": " + resultado);
    }

    private int calcularFactorialRecursivo(int numero) {
        if (numero == 0 || numero == 1) {
            return 1; // Caso base
        }
        return numero * calcularFactorialRecursivo(numero - 1); // Llamada recursiva
    }

    private void calcularFactorialRecursivo(int iteracion, int numero) {
        if (iteracion <= numero) {
            int numeroActual = iteracion;
            int resultadoParcial = calcularFactorialRecursivo(numeroActual);
            System.out.println("\n" + (iteracion + 1) + ". Llamada recursiva con numero " + numeroActual + ":");
            System.out.println("   - Numero actual: " + numeroActual);
            System.out.println("   - Llamada recursiva con numero " + (numeroActual - 1));
            System.out.println("   - Llamada recursiva terminada, retorno: " + resultadoParcial);
            calcularFactorialRecursivo(iteracion + 1, numero);
        }
    }
}
