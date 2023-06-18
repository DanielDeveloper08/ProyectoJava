package Ordenamiento;

import java.util.Scanner;

/**
 *
 * author danny
 */
public class AplicacionOrdenamiento {
  private Scanner scanner;

  public AplicacionOrdenamiento() {
    scanner = new Scanner(System.in);
  }

  public void ordenarLista() {
    System.out.print("Ingrese el numero de elementos a ingresar: ");
    int cantidad = scanner.nextInt();
    int[] lista = new int[cantidad];

    for (int i = 0; i < cantidad; i++) {
      System.out.print("Ingrese el valor n " + (i + 1) + ":");
      int valor = scanner.nextInt();
      lista[i] = valor;
    }

    System.out.println("\nLista no ordenada");

    for (int num : lista) {
      System.out.print(num + " ");
    }

    System.out.println("\n");

    metodoBurbuja(lista);
    System.out.println("Lista ordenada");
    for (int num : lista) {
      System.out.print(num + " ");
    }
  }

  public void metodoBurbuja(int[] lista) {
    int n = lista.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        // se compara elementos adyacentes y se realiza el intercambio si es necesario
        if (lista[j] > lista[j + 1]) {
          int temp = lista[j];
          lista[j] = lista[j + 1];
          lista[j + 1] = temp;
        }
      }
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
      System.out.println("1. Ordenar lista de elementos");
      System.out.println("0. Retornar");

      opcion = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de linea

      switch (opcion) {
        case 1:
          ordenarLista();
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
