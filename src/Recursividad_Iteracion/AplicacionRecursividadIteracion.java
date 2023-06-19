package Recursividad_Iteracion;

import java.util.Scanner;

/**
 *
 * author danny
 */
public class AplicacionRecursividadIteracion {
  private Scanner scanner;

  public AplicacionRecursividadIteracion() {
    scanner = new Scanner(System.in);
  }

  public void calcularFactorial() {
    System.out.print("Ingrese el numero a calcular el factorial: ");
    int numero = scanner.nextInt();

    int resultado = factorial(numero);

    System.out.println("El factorial de " + numero + " es: " + resultado);

  }

  public int factorial(int numero) {
    if (numero == 0 || numero == 1)
      return 1; // caso base

    return numero * factorial(numero - 1); // caso recursivo
  }

  public boolean retornar() {
    return true;
  }

  public boolean ejecutar() {
    boolean retornar = false;
    int opcion;
    do {
      System.out.println("Seleccione una opcion:");
      System.out.println("1. Calcular factorial de un numero");
      System.out.println("0. Retornar");

      opcion = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de linea

      switch (opcion) {
        case 1:
          calcularFactorial();
          break;

        case 0:
          retornar = retornar();
          break;

        default:
          System.out.println("Opcion invalida. Intente nuevamente.");
          break;
      }

      System.out.println();
    } while (opcion != 0);
    scanner.close();
    return retornar;
  }
}
