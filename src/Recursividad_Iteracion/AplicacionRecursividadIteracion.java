package Recursividad_Iteracion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicacionRecursividadIteracion {

    private Scanner scanner;

    public AplicacionRecursividadIteracion() {
        scanner = new Scanner(System.in);
    }

    public void calcularFactorial() {
        System.out.print("Ingrese el numero a calcular el factorial: ");
        int numero = scanner.nextInt();

        int resultado = factorialIterativo(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    public int factorialIterativo(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public void calcularFibonacci() {
        System.out.print("Ingrese el numero para calcular la secuencia de Fibonacci: ");
        int numero = scanner.nextInt();

        System.out.print("Secuencia de Fibonacci hasta el numero " + numero + ": ");
        for (int i = 0; i <= numero; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
        System.out.println();
    }

    public int fibonacciRecursivo(int numero) {
        if (numero == 0) {
            return 0; // caso base
        } else if (numero == 1) {
            return 1; // caso base
        }
        return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2); // caso recursivo
    }

    public boolean retornar() {
        return true;
    }

    public void ejecutar() {
        int opcion = 0;
        boolean opcionValida;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Calcular factorial de un numero (Iteracion)");
            System.out.println("2. Calcular la secuencia de Fibonacci (Recursividad)");

            try {
                System.out.print("Opcion: ");
                opcion = scanner.nextInt();
                opcionValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada invalida. Intente nuevamente.");
                opcionValida = false;
                scanner.nextLine(); // Consumir el salto de línea
            }

            if (opcionValida) {
                switch (opcion) {
                    case 1:
                        calcularFactorial();
                        break;

                    case 2:
                        calcularFibonacci();
                        break;

                    default:
                        System.out.println("Opcion invalida. Intente nuevamente.");
                        opcionValida = false;
                        break;
                }
            }

            System.out.println();
        } while (opcion != 0 || !opcionValida);

        scanner.close();
    }

}
