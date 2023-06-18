/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

import java.util.Scanner;

import Recursividad_Iteracion.AplicacionRecursividadIteracion;
import main.ClaseGenerica;

/**
 *
 * @author danny
 */
public class Ordenamiento {
  private static Scanner scanner = new Scanner(System.in);
  ClaseGenerica ordenamiento = new ClaseGenerica();

  public Ordenamiento() {
    seteoData();
  }

  public boolean principal() {
    boolean retornar = false;

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
          retornar = retornar();
          break;

        default:
          System.out.println("Opción inválida. Intente nuevamente.");
          break;
      }

      System.out.println();
    } while (opcion != 0);

    scanner.close();

    return retornar;
  }

  private static void mostrarMenu() {
    System.out.println("Seleccione una opción:");
    System.out.println("1. Definición");
    System.out.println("2. Algoritmo");
    System.out.println("3. Prueba de escritorio");
    System.out.println("4. Descripción del programa");
    System.out.println("5. Aplicación");
    System.out.println("0. Retornar");
  }

  private static int leerOpcion() {
    System.out.print("Opción: ");
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
        "Es el proceso de reorganizar elementos de una colección en un orden especifíco. El objetivo principal es establecer una secuencia ordenada que permita acceder, buscar y manipular los elementos de manera eficiente.");
    ordenamiento.setAlgoritmo("El algoritmo de ordenamiento burbuja se puede describir en los siguientes pasos:\n"
        + "\n"
        + "1. Declaración de la colección a ordenar.\n"
        + "2. Declarar bucle: el bucle se ejecutará n-1 veces, donde n es la cantidad de elementos de la colección.\n"
        + "3. Declarar un bucle interno: dentro del bucle anterior declararemos otro bucle este se ejecutara desde el primer elemento hasta el penúltimo elemento de la colección.\n"
        + "4. Comparación de elementos: dentro del bucle interno debemos comparar el elemento actual con el siguiente elemento adyacente, si el elemento actual es mayor intercambiamos sus posiciones.\n"
        + "5. Una vez terminada una pasada el elemento mas grande debera estar al final de la colección.\n"
        + "6. Esto se repetirá las veces especificadas y al final la colección estará ordenada.\n");
    ordenamiento.setDescripcionPrograma(
        "El programa permite ordenar una lista de numeros /n");
    AplicacionOrdenamiento aplicacion = new AplicacionOrdenamiento();
    ordenamiento.setAplicacion(aplicacion);
  }

  public boolean retornar() {
    return true;
  }

}
