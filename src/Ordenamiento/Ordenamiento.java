package Ordenamiento;

import java.util.Scanner;

import Recursividad_Iteracion.AplicacionRecursividadIteracion;
import main.ClaseGenerica;
import main.ProyectoPrimerParcial;

/**
 *
 * author danny
 */
public class Ordenamiento {
  private static Scanner scanner = new Scanner(System.in);
  ClaseGenerica ordenamiento = new ClaseGenerica();

  public Ordenamiento() {
    seteoData();
  }

  public void principal() {

    int opcion;
    do {
      mostrarMenu();
      opcion = leerOpcion();

      switch (opcion) {
        case 1:
          mostrarDefinicion();
          break;

        case 2:
          mostrarAlgoritmo();
          break;

        case 3:
          mostrarPruebaDeEscritorio();
          break;

        case 4:
          mostrarDescripcionDelPrograma();
          break;

        case 5:
          mostrarAplicacion();
          break;

        case 0:
          ProyectoPrimerParcial.ejecucionGeneral();
          break;

        default:
          System.out.println("Opcion invalida. Intente nuevamente.");
          break;
      }

      System.out.println();
    } while (opcion != 0);

    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("Seleccione una opcion:");
    System.out.println("1. Definicion");
    System.out.println("2. Algoritmo");
    System.out.println("3. Prueba de escritorio");
    System.out.println("4. Descripcion del programa");
    System.out.println("5. Aplicacion");
    System.out.println("0. Retornar");
  }

  private static int leerOpcion() {
    System.out.print("Opcion: ");
    return scanner.nextInt();
  }

  private void mostrarDefinicion() {
    System.out.println(ordenamiento.getDefinicion());
  }

  private void mostrarAlgoritmo() {
    System.out.println(ordenamiento.getAlgoritmo());
  }

  private void mostrarPruebaDeEscritorio() {
    // AGRGEAR
  }

  private void mostrarDescripcionDelPrograma() {
    System.out.println(ordenamiento.getDescripcionPrograma());
  }

  private void mostrarAplicacion() {
    AplicacionOrdenamiento app = (AplicacionOrdenamiento) ordenamiento.getAplicacion();
    boolean retornar = app.ejecutar();
    if (retornar) {
      principal();
    }
  }

  private void seteoData() {
    ordenamiento.setDefinicion(
        "Es el proceso de reorganizar elementos de una coleccion en un orden especifico. El objetivo principal es establecer una secuencia ordenada que permita acceder, buscar y manipular los elementos de manera eficiente.");
    ordenamiento.setAlgoritmo("El algoritmo de ordenamiento burbuja se puede describir en los siguientes pasos:\n"
        + "\n"
        + "1. Declaracion de la coleccion a ordenar.\n"
        + "2. Declarar bucle: el bucle se ejecutara n-1 veces, donde n es la cantidad de elementos de la coleccion.\n"
        + "3. Declarar un bucle interno: dentro del bucle anterior declararemos otro bucle este se ejecutara desde el primer elemento hasta el penultimo elemento de la coleccion.\n"
        + "4. Comparacion de elementos: dentro del bucle interno debemos comparar el elemento actual con el siguiente elemento adyacente, si el elemento actual es mayor intercambiamos sus posiciones.\n"
        + "5. Una vez terminada una pasada el elemento mas grande debera estar al final de la coleccion.\n"
        + "6. Esto se repetira las veces especificadas y al final la coleccion estara ordenada.\n");
    ordenamiento.setDescripcionPrograma(
        "El programa permite ordenar una lista de numeros /n");
    AplicacionOrdenamiento aplicacion = new AplicacionOrdenamiento();
    ordenamiento.setAplicacion(aplicacion);
  }

  public boolean retornar() {
    return true;
  }

}
