/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad_Iteracion;

import java.util.Scanner;

import main.ClaseGenerica;

/**
 *
 * @author danny
 */
public class RecursividadIteracion {
  private static Scanner scanner = new Scanner(System.in);
  ClaseGenerica recursividad = new ClaseGenerica();

  public RecursividadIteracion() {
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
          scanner.close();
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
    System.out.println(recursividad.getDefinicion());
  }

  private void mostrarAlgoritmo() {
    System.out.println(recursividad.getAlgoritmo());
  }

  private void mostrarPruebaDeEscritorio() {
    // AGRGEAR
  }

  private void mostrarDescripcionDelPrograma() {
    System.out.println(recursividad.getDescripcionPrograma());
  }

  private void mostrarAplicacion() {
    AplicacionRecursividadIteracion app = (AplicacionRecursividadIteracion) recursividad.getAplicacion();
    boolean retornar = app.ejecutar();
    if (retornar) {
      principal();
    }
  }

  private void seteoData() {
    recursividad.setDefinicion(
        "La recursividad es la capacidad de una función o procedimiento para llamarse a sí mismo dentro de su propia definición. En otras palabras es aquella función que se invoca a sí misma durante su ejecución.");
    recursividad.setAlgoritmo("El algoritmo de la recursividad se puede describir en los siguientes pasos:\n"
        + "\n"
        + "1. Declaración de la función: Se define la función recursiva, está deberá tener un caso base, que es una condición en la cual la recursión se detiene y se devuelve un resultado o realiza otra acción especifíca.\n"
        + "2. Verificar si la condición base se cumple: debemos confirmar que la condición aplicada detiene la recursión ya que si no es así se producirá un bucle infinito.\n"
        + "3. Volver a llamar a la función: si la condición base aún no se cumple debemos llamar otra vez a la misma función para aplicar recursividad\n"
        + "4. Ajustar parámetros: en cada llamada a la función recursiva debemos ajustar los parámetros que reciba para que se acerque cada vez más a la condición base.\n"
        + "5. Devolver el resultado.\n");
    recursividad.setDescripcionPrograma(
        "El programa permite calcular el factorial de un número usando recurvidad /n");
    AplicacionRecursividadIteracion aplicacion = new AplicacionRecursividadIteracion();
    recursividad.setAplicacion(aplicacion);
  }

  public boolean retornar() {
    return true;
  }

}
